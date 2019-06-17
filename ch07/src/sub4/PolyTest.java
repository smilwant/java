package sub4;

/*
 * 날짜 : 2019/06/12
 * 이름 : 이홍석
 * 내용 : 클래스 상속 실습하기 p288
 */
//다형성 : 부모클래스 변수 = new 자식클래스 ();

public class PolyTest {

	public static void main(String[] args) {
		Animal t = new Tiger();  
		Animal e = new Eagle();
		Animal s = new Shark();
	 //부모클래스 변수 = new 자식클래스(); 
		t.move(); // 다형성을 할 경우 참조변수를 부모 클래스만받음  
		t.hunt(); // 자식 클래스 에만 정의 되어있기때문에 부모클래스에도 정의 해줘야함
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();

	}
}