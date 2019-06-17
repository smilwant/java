package sub1;

public class SmartPhone extends Computer {

	// private String cpu;
	// private String ram;
	// private String hdd;
	private String brand;
	private String tel;
	private int price;
	private double size;

	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, double size, int price) {
		super(cpu, ram, hdd);
		this.brand = brand;
		this.tel = tel;
		this.size = size;
		this.price = price;
	}
	// public void calc() {} //ó���Ⱥκ��� �ߺ�
	// public void internet() {}

	public void call() {
		System.out.println(tel + " ��ȣ�� ��ȭ �Ŵ� ��...");

	}

	public void info() {
		super.info(); // cpu�� ram hdd  ���� ��� ������ 
		System.out.println("��ǰ�� : " + brand);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("ȭ��ũ�� : " + size);
		System.out.println("���� : " + price);

	}

}
