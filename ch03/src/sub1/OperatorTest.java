package sub1;

/* 
 * 
 * ��¥ : 2019/06/03
 * �̸� : ��ȫ��
 * ���� : ������ �ǽ��ϱ� ���� p64
 */
public class OperatorTest {
	public static void main(String[] args) {
		// ���� ������(�������ǰ��� ������ ������ ����)
		int num1 = 1;
		int num2 = 2;
		int num3 = 3, num4 = 4;

		// ��� ������
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2;
		int rs5 = num3 % num2; // ������ ������

		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);

		// ����,���� ������
		num1++;
		num2--;
		++num3;
		--num4;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);

		// ���մ��� ������
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;

		n1 += 1; // 1�� ���Ѱ��� n1�� ����
		n2 -= 2; // 2�� ������ n2�� ����
		n3 *= 3; // 3�� ���Ѱ��� n3�� ����
		n4 /= 4;// 4�� �������� n4�� ���� (�޸𸮿��� ���� �ѹ� �����Ϸ���)

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);

		// �� ������
		int var1 = 1;
		int var2 = 2;

		boolean r1 = (var1 > var2);
		boolean r2 = (var1 < var2);
		boolean r3 = (var1 >= var2);
		boolean r4 = (var1 <= var2);
		boolean r5 = (var1 == var2); // var1�� var2�� ����
		boolean r6 = (var1 != var2); // var1�� var2�� �ٸ���

		System.out.println(" r1 : " + r1);
		System.out.println(" r2 : " + r2);
		System.out.println(" r3 : " + r3);
		System.out.println(" r4 : " + r4);
		System.out.println(" r5 : " + r5);
		System.out.println(" r6 : " + r6);

		// �� ������
		boolean res1 = (var1 > 1) && (var2 > 2); // var1�� 1���� ũ�� �׸��� var2�� 2���� ũ�� f and f = false
		boolean res2 = (var1 < 1) && (var2 > 1); // var1�� 1���� �۴� �׸��� var2�� 1���� �۴� t and f = false
		boolean res3 = (var1 < 1) && (var2 <= 2); // var1�� 1���� �۴� �׸��� var2�� 1���� �۰ų� ���� t and t =true
		boolean res4 = (var1 < 2) || (var2 < 1);// var1�� 2���� �۴� �Ǵ� var2�� 1���� �۴� t or f = r
		boolean res5 = !(var1 > var2); // var1�� var2���� ũ���ʴ�
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
	}
}
