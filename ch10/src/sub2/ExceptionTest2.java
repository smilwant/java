package sub2;

/*
 * ��¥ : 2019/06/14
 * �̸� : ��ȫ��
 * ���� : �������� �ǽ��ϱ� ���� p433
* 
 */
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
// �迭�� �ε��� ��ȣ�� �߸� �������� �� 
		try {

			for (int i = 0; i <= arr.length; i++) {

				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// Null point ����

		try {

			Eagle eagle = new Eagle();
			Tiger tiger = null; // null�� ���°� �������ٴ� ��������

			eagle.move();
			tiger.move();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	//ĳ���ÿ��� 
		
		try {
		Animal ani = new Tiger();   //��ĳ����
		Tiger tiger = (Tiger) ani;  //�ٿ�ĳ���� 
		Eagle eagle = (Eagle) ani;  //�ٿ�ĳ����
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("���α׷� ����...");
	}
}
