package sub1;

/*
 * ��¥ : 2019/06/14
 * �̸� : ��ȫ��
 * ���� : ����ó�� �ǽ��ϱ� ���� p422
 */

public class ExceptionTest { // try catch �� = �߰��� ������ ������ �׺κи� ��� �Ѿ�� ����
	public static void main(String[] args) {// ����
		int num1 = 1;
		int num2 = 0;
		int num3 = 3;
		int num4 = 4;

		int rs1=0 ,rs2 =0 ,rs3= 0 ,rs4 = 0;
		
		
		try {
			//������ �߻��� �� �ִ� �ڵ��  
		 rs1 = num1 + num2;
		 rs2 = num1 - num2;
		 rs3 = num2 * num3;
		 rs4 = 0; // try{} �ȿ��� ����Ȱ� �������� ����� �ٽ� �ۼ�

		} catch (Exception e) { // ������ �߻� ������ ó���� �ڵ��
			System.out.println("�����߻�");
		}
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);

		System.out.println("���α׷� ����..."); // ����
	}
}
