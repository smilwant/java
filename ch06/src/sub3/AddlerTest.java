package sub3;

/*
 * ��¥ : 2019/06/10
 * �̸� : ��ȫ��
 * ���� : Ŭ���� �ǽ��ϱ�
 */

public class AddlerTest {
	public static void main(String[] args) {

		Addler ad = new Addler(); // ad =�����̸�
		ad.x = 100;
		int[] arr = { 1, 2, 3 }; 
		
		/* int[] arr = [3]; ���� ���� 
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 */
				 // stack�� �޼��尡 ������ ���ÿ� ������

		ad.add(ad.x);
		System.out.println("ad.x =" + ad.x);

		ad.add(ad);
		System.out.println("ad.x = " + ad.x);

		ad.add(arr);
		System.out.println("arr[0] = " + arr[0]);

		Addler ad2 = ad.addNew(ad);
		System.out.println("ad.x = " + ad.x);
		System.out.println("ad2.x = "+ ad2.x);
		// ������ addler(stack) Ʋ�� �����ͼ� ���� Ʋ�� heap�� ���� �� �� ������ ad�� �ּҰ��� ������
		// �� �� ������ addler(stack) Ʋ�� stack�� ���� �Ǿ� �ִ°��� �������� �����
	}
}
