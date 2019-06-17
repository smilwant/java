package sub2;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:클래스 실습하기 p191
 */
public class ClassTest {
	public static void main(String[] args) {
		// 객체 생성
		Account kb = new Account("국민은행", "123-12-1234", "김유신 ", 10000);
		// kb 객체를 인스턴스화 해줌 ();어카운트기호 이며 Account는메서드이름

		kb.deposit(10000); // stack에 잠시 생성되서 heap에 영향을 주고 사라짐
		kb.withdraw(7000);// stack에 잠시 생성되서 heap에 Account sh에 영향을 주고 사라짐
		kb.info();
		// private money 외부참조
		// kb.money -= 1; 사용 불가
		// 캡슐화가 필요 =보안에 취약함
		Account sh = new Account("신한은행", "123-265-45415", "김춘추", 50000); // sh 객체를 인스턴스화 해줌
		sh.deposit(50000);
		sh.withdraw(30000);
		sh.info();

		//samsung 컴퓨터 객체 생성 Intel i7 , 16GB , 1TB
		// apple 컴퓨터 객체 생성 
		Computer samsung = new Computer("Intel","16GB","1TB","i7");
		samsung.calc();
		samsung.internet();
		samsung.info();
		Computer apple = new Computer("Intel","8GB","512GB","i5");
		apple.calc();
		apple.internet();
		apple.info();
	}
}
// 객체 = 참조변수 , heap 객체 생성되는 영역  
//stack 에 저장된 kb를 heap에 저장된 kb 참조값을 가져와서 씀
//stack 에 저장된 sh를 heap에 저장된 sh 참조값을 가져와서 씀  