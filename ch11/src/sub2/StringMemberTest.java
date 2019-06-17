package sub2;

/*
 * ��¥ : 2019/06/17
 * �̸� : ��ȫ��
 * ���� : String Ŭ���� �ǽ��ϱ� ���� p496
 * 
 */

public class StringMemberTest {

	public static void main(String[] args) {
		String str = "Hello Korea";

		// length - ���ڿ� ����
		System.out.println("str ���ڿ��� ���� : " + str.length());

		// cahrAt - ��������
		System.out.println("str 6��° ���� : " + str.charAt(6));

		// substring = ���ڿ� �ڸ���
		System.out.println("sulstring(0 ,5) : " + str.substring(0, 5));
		// 0~5����
		System.out.println("sulstring(6) : " + str.substring(6));
		// 6�̻���� ����������

		// ����.indexOf , LastIndexOf -Ư������ �ε��� ���� ����
		int idx1 = str.indexOf("e"); // �տ������� Ư������ ã��
		int idx2 = str.lastIndexOf("e"); // �ڿ������� Ư������ ã��

		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);

		// ����.relpace - ���ڿ� ��ü
		String rs = str.replace("Korea", "Busan"); // korea�� Busan ����
		System.out.println("rs : " + rs);
		// String.valueOf - �Ϲ�Ÿ�� ������ ���ڿ��� ��ȯ
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
