package sub3;

public class InterfaceTest3 {
	public static void main(String[] args) {

		// 인터페이스 실습3 - 객체간 결합도를 완화
		Bulb bulb = new Bulb(); // 전구
		Socket socket = new Cable(bulb); // 소켓이지만 케이블이 연결되어있는것 사용하기 위해 전구를 연결하는것

		socket.switchOn();
		socket.switchOff();
	}
}
