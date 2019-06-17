package sub2;

/*
 * 날짜 : 2019/06/13
 * 이름 : 이홍석	
 * 내용: 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		// 인터페이스 실습2 - 다중 상속의 역할 하나는 상속 하나는 implements로 해서 다중상속처럼보이게함
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}
}
