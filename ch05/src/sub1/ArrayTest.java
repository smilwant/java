package sub1;

/* 
 *날짜 : 2019/06/05
 *이름 :이홍석 
 *내용 : 배열 실습하기 교재 p149
 * 배열만 한 후 6장 넘어가고 나중에 설명 해주심 
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 개별 변수로 데이터 저장
		// int num1 = 1;
		// int num2 = 2;
		// int num3 = 3;
		// int num4 = 4;
		// int num5 = 5;
		// int num6 = 6;
		// 배열로 데이터 저장
		int num[] = { 1, 2, 3, 4, 5 };
		// 배열 참조
		for (int i = 0; i < 5; i++) {
			System.out.println("num[" + i + "] :" + num[i]);
		}

		// 배열연습
		// String ps1 = "김유신";
		// String ps2 = "김춘추";
		// String ps3 = "장보고";
		// String ps4 = "강감찬";
		// String ps5 = "이순신";

		String ps[] = { "김유신", "김춘추", "장보고", "강감찬", "이순신" };

		for (int i = 0; i < ps.length; i++) {
			System.out.println("ps[" + i + "] :" + ps[i]);
		}

	}
}
