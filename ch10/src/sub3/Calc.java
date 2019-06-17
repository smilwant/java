package sub3;

public class Calc {

	public int plus(int x, int y) { // void 메서드의 반환값이 없다는표시
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

	// throws Exception하면 블럭자체가 try블럭이 됨 예외는 ThrowsTest에서잡아냄
	public int div(int x, int y) throws Exception {
// y값에 0이 들어오면 스파크가 튐 
		int z = x / y;
		return z;
	}
}
