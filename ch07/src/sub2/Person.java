package sub2;

public class Person {

	protected String name; // private ��� protected �� �ڽ��� ��� ���� �� �ְ���
	protected int age;

	public Person(String name, int age) { //��� ������
		this.name = name;
		this.age = age;
	}

	public void hello() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
