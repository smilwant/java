package sub1;

/* 
 *��¥ : 2019/06/05
 *�̸� :��ȫ�� 
 *���� : �迭 �ǽ��ϱ� ���� p149
 * �迭�� �� �� 6�� �Ѿ�� ���߿� ���� ���ֽ� 
 */
public class ArrayTest {
	public static void main(String[] args) {
		// ���� ������ ������ ����
		// int num1 = 1;
		// int num2 = 2;
		// int num3 = 3;
		// int num4 = 4;
		// int num5 = 5;
		// int num6 = 6;
		// �迭�� ������ ����
		int num[] = { 1, 2, 3, 4, 5 };
		// �迭 ����
		for (int i = 0; i < 5; i++) {
			System.out.println("num[" + i + "] :" + num[i]);
		}

		// �迭����
		// String ps1 = "������";
		// String ps2 = "������";
		// String ps3 = "�庸��";
		// String ps4 = "������";
		// String ps5 = "�̼���";

		String ps[] = { "������", "������", "�庸��", "������", "�̼���" };

		for (int i = 0; i < ps.length; i++) {
			System.out.println("ps[" + i + "] :" + ps[i]);
		}

	}
}
