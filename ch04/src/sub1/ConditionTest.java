package sub1;

/*
 * 날짜 : 2019/06/04
 * 이름 : 이홍석
 * 내용 : 조건문 실습하기 교재  p108
 */
public class ConditionTest {

	public static void main(String[] args) {
		// if
		int num1 = 1;
		int num2 = 2;

		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다.");
		}
		if (num1 > 0) {
			if (num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");

			}
		}

		if (num1 > 0 && num2 > 1) {

			System.out.println(" num1은 0보다 크고 num2는 1보다 크다.");

		}

		// if ~ else

		int var1 = 1;
		int var2 = 2;

		if (var1 > var2) {

			// 조건이 참 일때
			System.out.println("var1이 var2보다 크다");

		} else {

			System.out.println("var1이 var2보다 작다");
			// 조건이 거짓일때
		}

		// if~ else if ~else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;

		if (n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		} else if (n2 > n3) {
			System.out.println("n2이 n3보다 크다.");
		} else if (n3 > n4) {
			System.out.println("n3이 n4보다 크다.");
		} else {
			System.out.println("n4가 가장크다");
		}

		// if가 아니면 else if 실행 것도 아니면 else if 실행 것도 아니면 else밖에 할게 없으니까 실행

		// switch //
		String animal = "코끼리";
		switch (animal) {
		case "사자":
			System.out.println("animal은 사자입니다.");
			break;
		case "호랑이":
			System.out.println("animal은 호랑이입니다.");
			break;
		case "코끼리":
			System.out.println("animal은 코끼리입니다.");
			break;
		default:
			System.out.println("해당하는 animal이 없습니다.");
			break;
		}

	} 
}
