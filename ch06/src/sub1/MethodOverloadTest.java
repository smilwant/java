package sub1;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:메서드 오버로딩 실습하기 교재 p 230
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		overload();		
		overload(true);
		overload("홍길동");
		overload(1,4);
		overload(7);

	}

	public static void overload() {
		System.out.println("1번째 오버로드 메서드 ...");
	}
// 적재해서 쌓는데 매개변수로 구별 가능 
	public static void overload(int a) {
		System.out.println("2번째 오버로드 메서드 ...");
	}

	public static void overload(String name) {
		System.out.println("3번째 오버로드 메서드 ...");

	}

	public static void overload(boolean ok) {
		System.out.println("4번째 오버로드 메서드 ...");

	}

	public static void overload(int a, int b) {
		System.out.println("5번째 오버로드 메서드 ...");

	}

}
