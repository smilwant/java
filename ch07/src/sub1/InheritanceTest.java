package sub1;
/*
 * ��¥ : 2019/06/11
 * �̸� : ��ȫ��
 * ���� : Ŭ���� ��� �ǽ��ϱ� p288
 * 
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		SmartPhone iphone = new SmartPhone("A10","4GB","128GB","������7","010-1246-1354",6.5 , 1000000);
		SmartPhone gallaxy = new SmartPhone("2.3GHz","8GB","512GB","������10","010-8549-4584",5.5 , 800000);
		//SmartPhone������ info()�� ���� 
		iphone.calc();
		iphone.call();
		iphone.info();
		
		gallaxy.internet();
		gallaxy.call();
		gallaxy.info();
		
	}
}
