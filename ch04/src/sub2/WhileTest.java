package sub2;

/*
 * ��¥ : 2019/06/05
 * �̸� : ��ȫ��
 * ���� : while �ǽ��ϱ� ���� p124
 */
public class WhileTest {
	public static void main(String[] args) {
//1 ���� 10���� �� 
		int k = 1;
		int sum = 0;
		while (k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1���� 10���� �� : " + sum);
		// do ~ while
		int tot = 0;
		int i = 1;

		do {
			if (i % 2 == 1) {
				tot += i;
			}
			i++;
		} while (i <= 10); // while�� ������ ���� {}��
		// ���� �ѹ� ���� �� while�� ���ǿ� ���� �ݺ� ������������
		System.out.println("1���� 10���� Ȧ���� : " + tot);

		
		//break 
		int num = 1;
		while(true) {
			
			
			if(num%5==0 && num%7==0) {
				break; // �ݺ��� ���� 
			}
			num ++;
		}
		System.out.println("5��7�� �ּ� ����� :"+num);

		
		//continue
        int total = 0;
        for(int n=1 ; n<=10; n++) {
        if(n%2==0) {
        	continue; // �ݺ����� ������ �̵� 
        }
        total += n;
        }        
       System.out.println("1���� 10���� Ȧ���� : "+total);
		

	 
		
		
		
		
		
	
	
	
	}
}