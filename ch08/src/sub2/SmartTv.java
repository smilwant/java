package sub2;

public class SmartTv extends Tv implements Computer, ChromeCast { // ����� �ް� ��ǻ�͸� ����

	@Override
	public void booting() {
		System.out.println("SmartTv - booting!!! ");
	}

	@Override
	public void internet() {
		System.out.println("SmartTv - internet...");
	}

	@Override
	public void syncAndroid() {
		System.out.println("SmartTv - �ȵ���̵� ����ȭ...");
	}

}
