package sub2;

/*
 * ��¥ : 2019/06/17
 * �̸� : ��ȫ��
 * ���� : String Ŭ���� �ǽ��ϱ� ���� p457
 * 
 */

public class StringTest {

	public static void main(String[] args) {

		// ���ڿ� = ���� + �迭 C++���������� �Ѿ��
		String str = "Hello";

		// ���� + �迭 :c���� ���
		char[] c = { 'H', 'e', 'l', 'l', 'o', };

		// ���ڿ� ����
		String str1 = new String("Hello");
		String str2 = "Hello"; // ���ͷ�
		String str3 = new String("Hello");
		String str4 = "Hello";
		if (str1 == str2) { // Stack�� ����� �ּҰ��� ��
			System.out.println("str1�� str2 ������(=�ּҰ�)�� ����.");
		} else {
			System.out.println("str1�� str2 ������(=�ּҰ�)�� �ٸ���.");

		}
		if (str2 == str4) { // Stack�� ����� �ּҰ��� ��
			System.out.println("str2�� str4 ������(=�ּҰ�)�� ����.");
		} else {
			System.out.println("str2�� str4 ������(=�ּҰ�)�� �ٸ���.");

		}

		// H,e,l,l,o ������ �ּҰ�����
		// str2,str4�� �Ѱ��� ���� Heap������ Hello������
		// ���ڿ� ��
		if (str1.equals(str2)) {
			System.out.println("str1�� str2 ���ڿ��� ����.");
		} else {
			System.out.println("str1�� str2 ���ڿ��� �ٸ���");
		}

	}
}
