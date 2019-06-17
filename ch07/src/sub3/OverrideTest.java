package sub3;

/**
 * 날짜 : 2019/06/12
 * 이름 : 김철학
 * 내용 : 오버라이드 메서드 실습하기 교재 p295  
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		b.md1();
		b.md2();
		b.md2(1);
		b.md3();
		
		// final 실습하기
		// final 변수    : 상수
		// final 메서드 : 오버라이드 금지
		// final 클래스 : 상속 금지
		
		final int NUM = 1;
		final double PI = 3.14;			
		
	}	
}









