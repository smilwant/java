package sub1;

public class Outer {

	private int x;

	public Outer(int x) {
		this.x = x;
	}

	public void info() {
		System.out.println("Outer x : " + x);
	}

	public class Inner { // ����Ŭ����,��øŬ���� = Ŭ���� �ȿ� Ŭ���� �ϳ��� �� ����ִ°�
		private int x;

		public Inner(int x) {
			this.x = x;

		}

		public void info() {
			System.out.println("Inner x : " + x);
		}

	}

}
