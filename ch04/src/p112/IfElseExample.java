package p112;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {
			System.out.println("������ 100~90�Դϴ�");
			System.out.println("����� A�Դϴ�");

		}
		if (score >= 80) {
			System.out.println("������ 80~89�Դϴ�");
			System.out.println("����� B�Դϴ�");

		}
		if (score >= 70) {
			System.out.println("������ 70~79 �Դϴ�");
			System.out.println("����� C�Դϴ�");

		} else {
			System.out.println("������ 70 �̸��Դϴ�");
			System.out.println("����� D�Դϴ�");
		}
	}
}