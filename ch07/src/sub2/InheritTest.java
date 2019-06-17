package sub2;

/*
 * 날짜 : 2019/06/12
 * 이름 : 이홍석
 * 내용 : 클래스 상속 실습하기 p288
 */

public class InheritTest {
	public static void main(String[] args) {
		SalaryStudent std1 = new SalaryStudent("김유신", 21,"부경대","컴퓨터","삼성");
		SalaryStudent std2 = new SalaryStudent("김춘추", 20,"경성대","영문학","LG");

		std1.hello();
		std2.hello();
	
}
}