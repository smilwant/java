package sub2;
/*
 * 날짜 : 2019/06/14
 * 이름 : 이홍석
 * 내용 : 익명객체 실습하기 교재 p404
 * 
 */

public class AnomyTest {
	public static void main(String[] args) {

		Person p = new Person() { // 인터페이스를 클래스 구현없 new 연산으로 정의한 형태

			@Override
			public void info() {
				System.out.println("Person info 실행 ...");
			}

			@Override
			public void hello() {
				System.out.println("안녕하세요.");
			}
		};

		p.hello();
		p.info();
		
		
	}

}
