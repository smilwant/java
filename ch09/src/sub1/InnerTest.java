package sub1;

import sub1.Outer.Inner;

/*
 * ��¥ : 2019/06/14
 * �̸� : ��ȫ��
 * ���� : ��øŬ���� �ǽ��ϱ� ���� p390
 * 
 */

public class InnerTest {

	public static void main(String[] args) {

		Outer out = new Outer(1);
		out.info();

		Inner inn = out.new Inner(2); // out.�� �ٿ��� ���� ���������
		inn.info();

	}

}
