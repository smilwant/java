package sub1;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:�޼��� Ÿ�� �ǽ��ϱ� ���� p214   
 */

public class MethodTypeTest {

	public static void main(String[] args) {

// �޼��� ȣ��(����)		
		int r1 = type1(2, 3);
		int r2 = type1(5, 7);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);

		int score1[] = { 1, 2, 3, 4, 5 };
		int score2[] = { 2, 3, 4, 5, 6 };
		type2(score1);
		type2(score2);

		double r3 = type3();
		System.out.println("r3 : " + r3);

		type4();
		// ������ ���� �޼��� ����
		for (int i = 1; i <= 9; i++) {
			gugudan(i);
		}
	}

//�ż��� �Լ� �̸��� �ҹ��ڷν���, public���� ������ ����,void ��ȯŸ��, �Լ� ��ȣ () �Լ��� ����{}
//type1 - �Ű����� o, ���ϰ� o
	public static int type1(int x, int y) {
		int z = x * y;
		return z; // ������ ����� ��ȯ�Ѵ� ��ȯ�ϴ°��� ���´�ȣ void�� �ٲ������
// ȣ���� �����Ϸ��� static�� ���Ƿ� �ٿ������� static�� ���ٰ�����ϰ� ������ 
	}

	// type2 - �Ű����� o, ���ϰ� x
	public static void type2(int[] score) {// �迭, void�� ��ȯ Ÿ���� ���ٶ�¶�
		int sum = 0;

		for (int k = 0; k < score.length; k++) {
			sum += score[k];
		}
		System.out.println("score �� : " + sum);

	}

	// type3 - �Ű����� x, ���ϰ� o
	public static double type3() { // return ���� ������ ��������� void �ڸ���

		return 3.14;

	}

	// type4 - �Ű����� x, ���ϰ� x
	public static void type4() {
		int result = type1(3, 4);
		System.out.println("type1(3,4) ��� :" + result);

	}

	public static void gugudan(int num) {
		System.out.println(num + "�����");

		for (int k = 1; k <= 9; k++) {
			System.out.println(num + " x " + k + " = " + num * k);
		}

	}

}
