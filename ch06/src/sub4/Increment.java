package sub4;

/*
 * ��¥ : 2019/06/10
 * �̸� : ��ȫ��
 * 
 * 
 * 
 */
public class Increment {

	public int num1;
	//Ŭ���� ����, ��������
	public static int num2;

	public Increment() {

		this.num1++;
		this.num2++;

		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);

	}
	//Ŭ���� �޼��� , ���� �޼���  
	public static void add() {
	//	num1++; static �޼��忡���� non static ������ ���� �� ������.
		num2++;
	}

}
// ���� ���°��� new�� �Ź� ������� ������ �ϱ⺸�ٴ� �����Ҵ翵�� ����� �� ���� 