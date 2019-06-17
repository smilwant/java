package sub1;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:메서드 타입 실습하기 교제 p214   
 */

public class MethodTypeTest {

	public static void main(String[] args) {

// 메서드 호출(실행)		
		int r1 = type1(2, 3);
		int r2 = type1(5, 7);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);

		int score1[] = { 1, 2, 3, 4, 5 };
		int score2[] = { 2, 3, 4, 5, 6 };
		type2(score1);
		type2(score2);

		double r3 = type3();
		System.out.println("r3 : " + r3);

		type4();
		// 구구단 실행 메서드 실행
		for (int i = 1; i <= 9; i++) {
			gugudan(i);
		}
	}

//매서드 함수 이름은 소문자로시작, public으로 무조건 시작,void 반환타입, 함수 기호 () 함수의 영역{}
//type1 - 매개변수 o, 리턴값 o
	public static int type1(int x, int y) {
		int z = x * y;
		return z; // 연산의 결과를 반환한다 반환하는값의 형태댈호 void를 바꿔줘야함
// 호출을 실행하려고 static을 임의로 붙여주지만 static을 없다고생가하고 봐야함 
	}

	// type2 - 매개변수 o, 리턴값 x
	public static void type2(int[] score) {// 배열, void는 반환 타입이 없다라는뜻
		int sum = 0;

		for (int k = 0; k < score.length; k++) {
			sum += score[k];
		}
		System.out.println("score 합 : " + sum);

	}

	// type3 - 매개변수 x, 리턴값 o
	public static double type3() { // return 값의 형식을 맞춰줘야함 void 자리에

		return 3.14;

	}

	// type4 - 매개변수 x, 리턴값 x
	public static void type4() {
		int result = type1(3, 4);
		System.out.println("type1(3,4) 결과 :" + result);

	}

	public static void gugudan(int num) {
		System.out.println(num + "단출력");

		for (int k = 1; k <= 9; k++) {
			System.out.println(num + " x " + k + " = " + num * k);
		}

	}

}
