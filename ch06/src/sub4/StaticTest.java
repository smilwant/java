package sub4;

/*
 * ��¥ : 2019/06/10
 * �̸� : ��ȫ��
 * 

 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();

		inc1.num2 = 2;
		inc1.add();
		// Ŭ���� ���� , Ŭ���� �޼���� �̹� ���� �Ҵ翵���� ���� �Ǿ� �ֱ⶧����
		// ��ü ���� ���� �ٷ� ����(����) �� �� �ִ�.
		Increment.num2 = 2;
		Increment.add();

		// �̱��� ��ü ���
		// Calc cal = new Calc(); ��ü ������ �ȵ� private���� �����Ҵ翵������ ������ �������
		Calc cal = Calc.getInstance(); // ��ü ������ �ƴ϶� ��ü�� ���;��� 
		int r1 = cal.plus(1, 3);
		int r2 = cal.minus(1, 3);
		int r3 = cal.multi(2, 3);
		int r4 = cal.div(8, 2);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);

	}
}
