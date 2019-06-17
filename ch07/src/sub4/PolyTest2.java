package sub4;

public class PolyTest2 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();

		Animal obj[] = { t, e, s }; // 객체의 각자의 타입이 다를때 배열을 쓸때 다형성이 유용함
		obj[0].move();
		obj[0].hunt();

		obj[1].move();
		obj[1].hunt();

		obj[2].move();
		obj[2].hunt();
		// move(); static 메서드 이기때문에 아래의 move에 static 안붙이면 실행 불가
		move(t);
		move(e);
		move(s);

	}// main end
		// overLoading 똑같은 기능을 하는 클래스들을

	public static void move(Animal a) {
		a.move();
	}

	// public static void move(Shark s) {
	// s.move();
	// }
// 각자 하나 하나 만들어줘도되지만 다향성을 이용하면 Animal 하나로 다 커버가능 
}
