package sub1;

/* 
 * 
 * 날짜 : 2019/06/03
 * 이름 : 이홍석
 * 내용 : 연산자 실습하기 교재 p64
 */
public class OperatorTest {
	public static void main(String[] args) {
		// 대입 연산자(오른쪽의값을 왼쪽의 변수에 대입)
		int num1 = 1;
		int num2 = 2;
		int num3 = 3, num4 = 4;

		// 산술 연산자
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2;
		int rs5 = num3 % num2; // 나눈후 나머지

		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);

		// 증감,감소 연산자
		num1++;
		num2--;
		++num3;
		--num4;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);

		// 복합대입 연산자
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;

		n1 += 1; // 1을 더한것을 n1에 대입
		n2 -= 2; // 2을 뺀것을 n2에 대입
		n3 *= 3; // 3을 곱한것을 n3에 대입
		n4 /= 4;// 4를 나눈것을 n4에 대입 (메모리에서 변수 한번 대입하려고)

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);

		// 비교 연산자
		int var1 = 1;
		int var2 = 2;

		boolean r1 = (var1 > var2);
		boolean r2 = (var1 < var2);
		boolean r3 = (var1 >= var2);
		boolean r4 = (var1 <= var2);
		boolean r5 = (var1 == var2); // var1과 var2는 같다
		boolean r6 = (var1 != var2); // var1과 var2는 다르다

		System.out.println(" r1 : " + r1);
		System.out.println(" r2 : " + r2);
		System.out.println(" r3 : " + r3);
		System.out.println(" r4 : " + r4);
		System.out.println(" r5 : " + r5);
		System.out.println(" r6 : " + r6);

		// 논리 연산자
		boolean res1 = (var1 > 1) && (var2 > 2); // var1이 1보다 크다 그리고 var2가 2보다 크다 f and f = false
		boolean res2 = (var1 < 1) && (var2 > 1); // var1이 1보다 작다 그리고 var2가 1보다 작다 t and f = false
		boolean res3 = (var1 < 1) && (var2 <= 2); // var1이 1보다 작다 그리고 var2가 1보다 작거나 같다 t and t =true
		boolean res4 = (var1 < 2) || (var2 < 1);// var1이 2보다 작다 또는 var2가 1보다 작다 t or f = r
		boolean res5 = !(var1 > var2); // var1이 var2보다 크지않다
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
	}
}
