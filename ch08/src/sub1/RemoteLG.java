package sub1;

public class RemoteLG implements RemoteControl {// implements ±¸Çö

	@Override
	public void powerOn() {
		System.out.println("LG - powerOn");
	}

	@Override
	public void poweroff() {
		System.out.println("LG - powerOff");
	}

	@Override
	public void SoundDown() {
		System.out.println("LG - chUp");
	}

	@Override
	public void chUp() {
		System.out.println("LG - chDown");
	}

	@Override
	public void chDown() {
		System.out.println("LG - soundUp");
	}

	@Override
	public void SoundUp() {
		System.out.println("LG - soundDown");
	}

}
