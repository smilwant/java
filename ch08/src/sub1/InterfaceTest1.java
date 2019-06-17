package sub1;

/*
 * 날짜 : 2019/06/13
 * 이름 : 이홍석	
 * 내용: 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		// 인터페이스 실습1 - 클래스의 표준 가이드 역할

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
