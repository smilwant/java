package sub3;
/*
 * 날짜 : 2019/06/17
 * 이름 : 이홍석
 * 내용 : AutoBox 실습하기 교재 p527
 * 
 */

public class AutoBoxTest {
	public static void main(String[] args) {
		// 오토박스
		Boolean box1 = false;
		Integer box2 = 2;
		Double box3 = 3.14;
		Float box4 = 3.14f;
		
		// 오토언박스
		boolean ubox1 = box1;
		int ubox2 = box2;
		double ubox3 = box3;
		float ubox4 = box4;
		
		System.out.println("ubox1 : "+ubox1);
		System.out.println("ubox2 : "+ubox2);
		System.out.println("ubox3 : "+ubox3);
		System.out.println("ubox4 : "+ubox4);
		
		
		
	}
}
