package sub2;

public class Person {

	protected String name; // private 대신 protected 로 자식이 상속 받을 수 있게함
	protected int age;

	public Person(String name, int age) { //상속 시켜줌
		this.name = name;
		this.age = age;
	}

	public void hello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
