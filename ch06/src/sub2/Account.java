package sub2;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:Ŭ���� ���� 
 */
public class Account { //class ���Ǽ��� ��ü�� �߻�ȭ �Ͽ������  
	// Ư�� - �ɹ����� ����  public �������� ������ �ٿ��ٰ�
	private String bank;
	private String id;
	private String name;
	private int money;
// ĸ��ȭ - �ɹ����� �������������ڸ� private�� �����ؼ� �ܺ������� ���� 
	//������

	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}

	
	
	// ��� - �޼��� ���� , ��� �޼��� 
	// �Ʒ� 3������ �޼��� 
 	public void deposit(int money) {
		this.money += money; // �ɹ����� �ܾ� =�ɹ����� �ܾ�+ �Ա�

	}

	public void withdraw(int money) {
		this.money -= money;

	}

	public void info() {
		System.out.println("=======================");
		System.out.println("����� : " + bank);
		System.out.println("����� : " + id);
		System.out.println("����� : " + name);
		System.out.println("����� : " + money);
		System.out.println("-----------------------");

	}

}
