package sub3;

/*
 * ��¥ : 2019/06/14
 * �̸� : ��ȫ��
 * ���� : ���� ���ѱ�� �ǽ��ϱ� ���� p440
 *
 */
public class ThrowsTest {
	public static void main(String[] args) throws Exception {
		Calc c = new Calc();

		int r1 = c.plus(1, 2);
		int r2 = c.minus(2, 3);
		int r3 = c.multi(3, 5);
		int r4 = c.div(8, 0);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);

		System.out.println("���α׷� ����... ");
	}
}
