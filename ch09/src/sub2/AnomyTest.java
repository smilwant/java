package sub2;
/*
 * ��¥ : 2019/06/14
 * �̸� : ��ȫ��
 * ���� : �͸�ü �ǽ��ϱ� ���� p404
 * 
 */

public class AnomyTest {
	public static void main(String[] args) {

		Person p = new Person() { // �������̽��� Ŭ���� ������ new �������� ������ ����

			@Override
			public void info() {
				System.out.println("Person info ���� ...");
			}

			@Override
			public void hello() {
				System.out.println("�ȳ��ϼ���.");
			}
		};

		p.hello();
		p.info();
		
		
	}

}
