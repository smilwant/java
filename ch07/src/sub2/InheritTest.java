package sub2;

/*
 * ��¥ : 2019/06/12
 * �̸� : ��ȫ��
 * ���� : Ŭ���� ��� �ǽ��ϱ� p288
 */

public class InheritTest {
	public static void main(String[] args) {
		SalaryStudent std1 = new SalaryStudent("������", 21,"�ΰ��","��ǻ��","�Ｚ");
		SalaryStudent std2 = new SalaryStudent("������", 20,"�漺��","������","LG");

		std1.hello();
		std2.hello();
	
}
}