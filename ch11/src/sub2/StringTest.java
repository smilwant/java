package sub2;

/*
 * 날짜 : 2019/06/17
 * 이름 : 이홍석
 * 내용 : String 클래스 실습하기 교재 p457
 * 
 */

public class StringTest {

	public static void main(String[] args) {

		// 문자열 = 문자 + 배열 C++에서나오고 넘어옴
		String str = "Hello";

		// 문자 + 배열 :c언어에서 사용
		char[] c = { 'H', 'e', 'l', 'l', 'o', };

		// 문자열 생성
		String str1 = new String("Hello");
		String str2 = "Hello"; // 리터럴
		String str3 = new String("Hello");
		String str4 = "Hello";
		if (str1 == str2) { // Stack에 저장된 주소값만 비교
			System.out.println("str1과 str2 참조값(=주소값)이 같다.");
		} else {
			System.out.println("str1과 str2 참조값(=주소값)이 다르다.");

		}
		if (str2 == str4) { // Stack에 저장된 주소값만 비교
			System.out.println("str2과 str4 참조값(=주소값)이 같다.");
		} else {
			System.out.println("str2과 str4 참조값(=주소값)이 다르다.");

		}

		// H,e,l,l,o 각각의 주소값저장
		// str2,str4가 한개의 같은 Heap영역의 Hello를참조
		// 문자열 비교
		if (str1.equals(str2)) {
			System.out.println("str1과 str2 문자열이 같다.");
		} else {
			System.out.println("str1과 str2 문자열이 다르다");
		}

	}
}
