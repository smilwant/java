package sub2;

public class Computer {
	// 특성 (맴버변수)
	private String cpu;
	private String ram;
	private String hdd;
	private String core;

	// 생성자 this 는 변수들은 11줄의 변수를 참조하기때문에 위의5~8 번까지의 맴버변수를 지칭하기위해서
	public Computer(String cpu, String ram, String hdd, String core) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.core = core;
	}

	// 기능(맴버메서드)
	public void calc() {
		System.out.println("계산을 합니다 ... ");
	}

	public void internet() {
		System.out.println("인터넷을 합니다 ...");
	}

	public void info() {
		System.out.println(" CPU : " + cpu);
		System.out.println(" RAM : " + ram);
		System.out.println(" HDD : " + hdd);
		System.out.println("CORE : " + core);
	}

}
