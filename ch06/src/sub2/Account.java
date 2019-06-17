package sub2;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:클래스 이해 
 */
public class Account { //class 현실세계 객체로 추상화 하여만든것  
	// 특성 - 맴버변수 선언  public 접근제어 지시자 붙여줄것
	private String bank;
	private String id;
	private String name;
	private int money;
// 캡슐화 - 맴버변수 접근제어지시자를 private로 지정해서 외부참조를 차단 
	//생성자

	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}

	
	
	// 기능 - 메서드 정의 , 멤버 메서드 
	// 아래 3가지는 메서드 
 	public void deposit(int money) {
		this.money += money; // 맴버변수 잔액 =맴버변수 잔액+ 입금

	}

	public void withdraw(int money) {
		this.money -= money;

	}

	public void info() {
		System.out.println("=======================");
		System.out.println("은행명 : " + bank);
		System.out.println("은행명 : " + id);
		System.out.println("은행명 : " + name);
		System.out.println("은행명 : " + money);
		System.out.println("-----------------------");

	}

}
