package sub2;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:Ŭ���� �ǽ��ϱ� p191
 */
public class ClassTest {
	public static void main(String[] args) {
		// ��ü ����
		Account kb = new Account("��������", "123-12-1234", "������ ", 10000);
		// kb ��ü�� �ν��Ͻ�ȭ ���� ();��ī��Ʈ��ȣ �̸� Account�¸޼����̸�

		kb.deposit(10000); // stack�� ��� �����Ǽ� heap�� ������ �ְ� �����
		kb.withdraw(7000);// stack�� ��� �����Ǽ� heap�� Account sh�� ������ �ְ� �����
		kb.info();
		// private money �ܺ�����
		// kb.money -= 1; ��� �Ұ�
		// ĸ��ȭ�� �ʿ� =���ȿ� �����
		Account sh = new Account("��������", "123-265-45415", "������", 50000); // sh ��ü�� �ν��Ͻ�ȭ ����
		sh.deposit(50000);
		sh.withdraw(30000);
		sh.info();

		//samsung ��ǻ�� ��ü ���� Intel i7 , 16GB , 1TB
		// apple ��ǻ�� ��ü ���� 
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
// ��ü = �������� , heap ��ü �����Ǵ� ����  
//stack �� ����� kb�� heap�� ����� kb �������� �����ͼ� ��
//stack �� ����� sh�� heap�� ����� sh �������� �����ͼ� ��  