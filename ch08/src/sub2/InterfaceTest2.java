package sub2;

/*
 * ��¥ : 2019/06/13
 * �̸� : ��ȫ��	
 * ����: �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		// �������̽� �ǽ�2 - ���� ����� ���� �ϳ��� ��� �ϳ��� implements�� �ؼ� ���߻��ó�����̰���
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}
}
