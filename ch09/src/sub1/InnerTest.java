package sub1;

import sub1.Outer.Inner;

/*
 * 날짜 : 2019/06/14
 * 이름 : 이홍석
 * 내용 : 중첩클래스 실습하기 교재 p390
 * 
 */

public class InnerTest {

	public static void main(String[] args) {

		Outer out = new Outer(1);
		out.info();

		Inner inn = out.new Inner(2); // out.을 붙여서 종속 시켜줘야함
		inn.info();

	}

}
