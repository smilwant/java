package sub3;

public class InterfaceTest3 {
	public static void main(String[] args) {

		// �������̽� �ǽ�3 - ��ü�� ���յ��� ��ȭ
		Bulb bulb = new Bulb(); // ����
		Socket socket = new Cable(bulb); // ���������� ���̺��� ����Ǿ��ִ°� ����ϱ� ���� ������ �����ϴ°�

		socket.switchOn();
		socket.switchOff();
	}
}
