package sub1;

public class Outer {

	private int x;

	public Outer(int x) {
		this.x = x;
	}

	public void info() {
		System.out.println("Outer x : " + x);
	}

	public class Inner { // 내부클래스,중첩클래스 = 클래스 안에 클래스 하나가 더 들어있는것
		private int x;

		public Inner(int x) {
			this.x = x;

		}

		public void info() {
			System.out.println("Inner x : " + x);
		}

	}

}
