package sub4;

/*
 * 날짜 : 2019/06/10
 * 이름 : 이홍석
 * 

 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();

		inc1.num2 = 2;
		inc1.add();
		// 클래스 변수 , 클래스 메서드는 이미 고정 할당영역에 생성 되어 있기때문에
		// 객체 생성 없이 바로 실행(참조) 할 수 있다.
		Increment.num2 = 2;
		Increment.add();

		// 싱글톤 객체 얻기
		// Calc cal = new Calc(); 객체 생성이 안됨 private으로 고정할당영역것을 가져다 쓰라고함
		Calc cal = Calc.getInstance(); // 객체 생성이 아니라 객체를 얻어와야함 
		int r1 = cal.plus(1, 3);
		int r2 = cal.minus(1, 3);
		int r3 = cal.multi(2, 3);
		int r4 = cal.div(8, 2);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);

	}
}
