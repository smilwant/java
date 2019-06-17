package sub1;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung - powerOn");
	}

	@Override
	public void poweroff() {
		System.out.println("Samsung - powerOff");
	}

	@Override
	public void SoundDown() {
		System.out.println("Samsung - chUp");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung - chDown");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung - soundUp");
	}

	@Override
	public void SoundUp() {
		System.out.println("Samsung - soundDown");
	}

}


