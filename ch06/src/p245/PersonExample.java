package p245;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("12345-678913", "계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		// p1.nation = " usa";
		// p1.ssn = "6545798-465845";
		p1.name = "을지문덕";
	}
}
