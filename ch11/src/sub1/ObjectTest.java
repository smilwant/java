package sub1;

/*
 * ��¥ : 2019/06/17
 * �̸� : ��ȫ��
 * ���� : Object Ŭ���� �ǽ��ϱ� ���� p457
 * 
 */

public class ObjectTest {

	public static void main(String[] args) {

		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�Ϻ�", 2000);
		Banana b1 = new Banana("�ʸ���", 2000);
		Banana b2 = new Banana("���ֵ�", 1500);
		//��ĳ����(������)
		Object fruit[] = { a1, a2, b1, b2 }; // ��� Ŭ������ Object�� ��ӹް��ִ� (�Ⱥ���)

		// fruit[0].info(); Ÿ���� Object �̱⶧���� ����
		// �ٿ�ĳ����
		Apple f1 = (Apple) fruit[1];
		Banana f2 = (Banana) fruit[2];
		f1.info();
		f2.info();

	}

}
