package sub1;

/*
 * ��¥ : 2019/06/04
 * �̸� : ��ȫ��
 * ���� : if�� �������� 
 * 
 */

public class IfTest {
	public static void main(String[] args) {
		int score = 90;
		if (score >= 90 && score <= 100) {
			System.out.println("A �Դϴ�.");

		} else if (score >= 80 && score < 90) {
			System.out.println("B �Դϴ�.");

		} else if (score >= 70 && score < 79) {
			System.out.println("C �Դϴ�.");

		} else if (score >= 60 && score < 69) {
			System.out.println("D �Դϴ�.");

		} else {
			System.out.println("F �Դϴ�.");
		}

	}
}
