package sub1;

/*
 * �̸�:��ȫ��
 * ��¥:2019/06/07
 * ����:�޼��� ���� �޸� �ǽ��ϱ�
 */
public class MethodScopeTest {

	public static void main(String[] args) {
		int result = 0;
		int start = 1;
		int end = 10;
		result = sum(start, end);
		System.out.println("��� : "+result);
		//�޼��� sum , e, s, k�� �����
	}
		
	public static int sum(int s, int e) {
		int sum = 0 ;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
	//for���� ����Ŭ�� �ٵ���  k�� �Ҹ��		
		}
		return sum; // ������ sumdms 14�� result�� �� �� �Ŀ� �޼��忡 ����� ������ �����
	}
	
		//stack
		
		

}
