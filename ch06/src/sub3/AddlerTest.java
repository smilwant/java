package sub3;

/*
 * 날짜 : 2019/06/10
 * 이름 : 이홍석
 * 내용 : 클래스 실습하기
 */

public class AddlerTest {
	public static void main(String[] args) {

		Addler ad = new Addler(); // ad =변수이름
		ad.x = 100;
		int[] arr = { 1, 2, 3 }; 
		
		/* int[] arr = [3]; 원래 모형 
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 */
				 // stack은 메서드가 끝남과 동시에 없어짐

		ad.add(ad.x);
		System.out.println("ad.x =" + ad.x);

		ad.add(ad);
		System.out.println("ad.x = " + ad.x);

		ad.add(arr);
		System.out.println("arr[0] = " + arr[0]);

		Addler ad2 = ad.addNew(ad);
		System.out.println("ad.x = " + ad.x);
		System.out.println("ad2.x = "+ ad2.x);
		// 기존의 addler(stack) 틀을 가져와서 새로 틀을 heap에 만듬 그 후 기존의 ad에 주소값을 덮어씌우고
		// 그 후 기존의 addler(stack) 틀은 stack과 연결 되어 있는값이 없어져서 사라짐
	}
}
