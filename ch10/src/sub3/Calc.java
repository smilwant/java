package sub3;

public class Calc {

	public int plus(int x, int y) { // void �޼����� ��ȯ���� ���ٴ�ǥ��
		int z = x + y;
		return z;
	}

	public int minus(int x, int y) {

		int z = x - y;
		return z;
	}

	public int multi(int x, int y) {

		int z = x * y;
		return z;
	}

	// throws Exception�ϸ� ����ü�� try���� �� ���ܴ� ThrowsTest������Ƴ�
	public int div(int x, int y) throws Exception {
// y���� 0�� ������ ����ũ�� Ʀ 
		int z = x / y;
		return z;
	}
}
