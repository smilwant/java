package p69;

public class SignOperatorExample {
public static void main(String[] args) {
	int x = -100;
	int result1 = +x; // �ǿ������� ��ȣ ����
	int result2 = -x; // �ǿ������� ��ȣ ���� 
	System.out.println("result1="+result1);
	System.out.println("result2="+result2);
	
	short s = 100; 
	int result3 = -s;   // short��ȣ�����  intŸ�԰�����  �ٲ� 
	System.out.println("result3="+result3);
}
}
