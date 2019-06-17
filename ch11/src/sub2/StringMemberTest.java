package sub2;

/*
 * 날짜 : 2019/06/17
 * 이름 : 이홍석
 * 내용 : String 클래스 실습하기 교재 p496
 * 
 */

public class StringMemberTest {

	public static void main(String[] args) {
		String str = "Hello Korea";

		// length - 문자열 길이
		System.out.println("str 문자열의 길이 : " + str.length());

		// cahrAt - 문자추출
		System.out.println("str 6번째 문자 : " + str.charAt(6));

		// substring = 문자열 자르기
		System.out.println("sulstring(0 ,5) : " + str.substring(0, 5));
		// 0~5까지
		System.out.println("sulstring(6) : " + str.substring(6));
		// 6이상부터 마지막까지

		// 변수.indexOf , LastIndexOf -특정문자 인덱스 값을 추출
		int idx1 = str.indexOf("e"); // 앞에서부터 특정문자 찾음
		int idx2 = str.lastIndexOf("e"); // 뒤에서부터 특정문자 찾음

		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);

		// 변수.relpace - 문자열 교체
		String rs = str.replace("Korea", "Busan"); // korea를 Busan 으로
		System.out.println("rs : " + rs);
		// String.valueOf - 일반타입 변수를 문자열로 변환
		int var1 = 22;
		double var2 = 1.12345;
		boolean var3 = true;

		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = "" + var3;

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);

	}
}
