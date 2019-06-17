package sub1;

/*
 * 날짜 : 2019/06/04
 * 이름 : 이홍석
 * 내용 : if문 연습문제 
 * 
 */

public class IfTest {
	public static void main(String[] args) {
		int score = 90;
		if (score >= 90 && score <= 100) {
			System.out.println("A 입니다.");

		} else if (score >= 80 && score < 90) {
			System.out.println("B 입니다.");

		} else if (score >= 70 && score < 79) {
			System.out.println("C 입니다.");

		} else if (score >= 60 && score < 69) {
			System.out.println("D 입니다.");

		} else {
			System.out.println("F 입니다.");
		}

	}
}
