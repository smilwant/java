package sub2;

public class Computer {
	// Ư�� (�ɹ�����)
	private String cpu;
	private String ram;
	private String hdd;
	private String core;

	// ������ this �� �������� 11���� ������ �����ϱ⶧���� ����5~8 �������� �ɹ������� ��Ī�ϱ����ؼ�
	public Computer(String cpu, String ram, String hdd, String core) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.core = core;
	}

	// ���(�ɹ��޼���)
	public void calc() {
		System.out.println("����� �մϴ� ... ");
	}

	public void internet() {
		System.out.println("���ͳ��� �մϴ� ...");
	}

	public void info() {
		System.out.println(" CPU : " + cpu);
		System.out.println(" RAM : " + ram);
		System.out.println(" HDD : " + hdd);
		System.out.println("CORE : " + core);
	}

}
