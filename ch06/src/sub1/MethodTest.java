package sub1;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:메서드 실습하기 교제 p214
 */

// 메소드 : 함수 

public class MethodTest {
	public static void main(String[] args) { // static 메서드
//메서드 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);

		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
	}

	// 메서드 정의
	public static int fx(int x) { // static을 붙여줘서 메서드를 맞춰줌
		// 메소드(함수) : 일련의 코드로직, 반복적으로 사용할 코드를 모듈화 시키는것
		int y = 2 * x + 3;
		return y;
	}

}
