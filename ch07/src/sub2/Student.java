package sub2;

public class Student  extends Person {
	protected String school;
	protected String major;
	
	public Student(String name, int age , String school, String major) {
		super(name,age);
		this.school = school;
		this.major = major;
	}
	public void hello() {
		System.out.println("�б� : "+school);
		System.out.println("���� : "+major);
	}
}
