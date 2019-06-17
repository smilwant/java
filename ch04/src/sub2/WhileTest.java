package sub2;

/*
 * 날짜 : 2019/06/05
 * 이름 : 이홍석
 * 내용 : while 실습하기 교재 p124
 */
public class WhileTest {
	public static void main(String[] args) {
//1 부터 10까지 합 
		int k = 1;
		int sum = 0;
		while (k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		// do ~ while
		int tot = 0;
		int i = 1;

		do {
			if (i % 2 == 1) {
				tot += i;
			}
			i++;
		} while (i <= 10); // while의 조건이 위의 {}임
		// 최초 한번 실행 후 while의 조건에 따라 반복 할지말지결정
		System.out.println("1부터 10까지 홀수합 : " + tot);

		
		//break 
		int num = 1;
		while(true) {
			
			
			if(num%5==0 && num%7==0) {
				break; // 반복문 종료 
			}
			num ++;
		}
		System.out.println("5와7의 최소 공배수 :"+num);

		
		//continue
        int total = 0;
        for(int n=1 ; n<=10; n++) {
        if(n%2==0) {
        	continue; // 반복문의 상위로 이동 
        }
        total += n;
        }        
       System.out.println("1부터 10까지 홀수합 : "+total);
		

	 
		
		
		
		
		
	
	
	
	}
}