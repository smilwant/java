package sub4;

/*
 * 날짜 : 2019/06/10
 * 이름 : 이홍석
 * 
 * 
 * 
 */
public class Increment {

	public int num1;
	//클래스 변수, 정적변수
	public static int num2;

	public Increment() {

		this.num1++;
		this.num2++;

		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);

	}
	//클래스 메서드 , 정적 메서드  
	public static void add() {
	//	num1++; static 메서드에서는 non static 변수를 참조 할 수없다.
		num2++;
	}

}
// 자주 쓰는것은 new로 매번 만들었다 지웠다 하기보다는 고정할당영역 사용이 더 좋음 