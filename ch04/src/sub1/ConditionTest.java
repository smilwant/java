package sub1;

/*
 * ��¥ : 2019/06/04
 * �̸� : ��ȫ��
 * ���� : ���ǹ� �ǽ��ϱ� ����  p108
 */
public class ConditionTest {

	public static void main(String[] args) {
		// if
		int num1 = 1;
		int num2 = 2;

		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		}
		if (num1 > 0) {
			if (num2 > 1) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");

			}
		}

		if (num1 > 0 && num2 > 1) {

			System.out.println(" num1�� 0���� ũ�� num2�� 1���� ũ��.");

		}

		// if ~ else

		int var1 = 1;
		int var2 = 2;

		if (var1 > var2) {

			// ������ �� �϶�
			System.out.println("var1�� var2���� ũ��");

		} else {

			System.out.println("var1�� var2���� �۴�");
			// ������ �����϶�
		}

		// if~ else if ~else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;

		if (n1 > n2) {
			System.out.println("n1�� n2���� ũ��.");
		} else if (n2 > n3) {
			System.out.println("n2�� n3���� ũ��.");
		} else if (n3 > n4) {
			System.out.println("n3�� n4���� ũ��.");
		} else {
			System.out.println("n4�� ����ũ��");
		}

		// if�� �ƴϸ� else if ���� �͵� �ƴϸ� else if ���� �͵� �ƴϸ� else�ۿ� �Ұ� �����ϱ� ����

		// switch //
		String animal = "�ڳ���";
		switch (animal) {
		case "����":
			System.out.println("animal�� �����Դϴ�.");
			break;
		case "ȣ����":
			System.out.println("animal�� ȣ�����Դϴ�.");
			break;
		case "�ڳ���":
			System.out.println("animal�� �ڳ����Դϴ�.");
			break;
		default:
			System.out.println("�ش��ϴ� animal�� �����ϴ�.");
			break;
		}

	} 
}
