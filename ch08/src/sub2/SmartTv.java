package sub2;

public class SmartTv extends Tv implements Computer, ChromeCast { // 상속을 받고 컴퓨터를 구현

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
		System.out.println("SmartTv - 안드로이드 동기화...");
	}

}
