package sub2;

/*
 * 날짜 : 2019/06/14
 * 이름 : 이홍석
 * 내용 : 예외종류 실습하기 교재 p433
* 
 */
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
// 배열에 인덱스 번호를 잘못 지정했을 때 
		try {

			for (int i = 0; i <= arr.length; i++) {

				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// Null point 에러

		try {

			Eagle eagle = new Eagle();
			Tiger tiger = null; // null은 상태가 아직없다는 부정값임

			eagle.move();
			tiger.move();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	//캐스팅에러 
		
		try {
		Animal ani = new Tiger();   //업캐스팅
		Tiger tiger = (Tiger) ani;  //다운캐스팅 
		Eagle eagle = (Eagle) ani;  //다운캐스팅
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 종료...");
	}
}
