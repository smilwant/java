package sub1;

/*
 * ��¥ : 2019/06/13
 * �̸� : ��ȫ��	
 * ����: �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		// �������̽� �ǽ�1 - Ŭ������ ǥ�� ���̵� ����

		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();

		lg.powerOn();
		lg.chUp();
		lg.SoundUp();

		samsung.powerOn();
		samsung.SoundDown();
		samsung.chDown();

	}
}
