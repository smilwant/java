package sub1;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:�޼��� �����ε� �ǽ��ϱ� ���� p 230
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		overload();		
		overload(true);
		overload("ȫ�浿");
		overload(1,4);
		overload(7);

	}

	public static void overload() {
		System.out.println("1��° �����ε� �޼��� ...");
	}
// �����ؼ� �״µ� �Ű������� ���� ���� 
	public static void overload(int a) {
		System.out.println("2��° �����ε� �޼��� ...");
	}

	public static void overload(String name) {
		System.out.println("3��° �����ε� �޼��� ...");

	}

	public static void overload(boolean ok) {
		System.out.println("4��° �����ε� �޼��� ...");

	}

	public static void overload(int a, int b) {
		System.out.println("5��° �����ε� �޼��� ...");

	}

}
