package sub1;
/*
 * 날짜 : 2019/06/11
 * 이름 : 이홍석
 * 내용 : 클래스 상속 실습하기 p288
 * 
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		SmartPhone iphone = new SmartPhone("A10","4GB","128GB","아이폰7","010-1246-1354",6.5 , 1000000);
		SmartPhone gallaxy = new SmartPhone("2.3GHz","8GB","512GB","갤럭시10","010-8549-4584",5.5 , 800000);
		//SmartPhone에서의 info()를 실행 
		iphone.calc();
		iphone.call();
		iphone.info();
		
		gallaxy.internet();
		gallaxy.call();
		gallaxy.info();
		
	}
}
