package sub1;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:�޼��� �ǽ��ϱ� ���� p214
 */

// �޼ҵ� : �Լ� 

public class MethodTest {
	public static void main(String[] args) { // static �޼���
//�޼��� ����(ȣ��)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);

		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
	}

	// �޼��� ����
	public static int fx(int x) { // static�� �ٿ��༭ �޼��带 ������
		// �޼ҵ�(�Լ�) : �Ϸ��� �ڵ����, �ݺ������� ����� �ڵ带 ���ȭ ��Ű�°�
		int y = 2 * x + 3;
		return y;
	}

}
