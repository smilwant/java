package sub1;

/*
 * 이름:이홍석
 * 날짜:2019/06/07
 * 내용:메서드 영역 메모리 실습하기
 */
public class MethodScopeTest {

	public static void main(String[] args) {
		int result = 0;
		int start = 1;
		int end = 10;
		result = sum(start, end);
		System.out.println("결과 : "+result);
		//메서드 sum , e, s, k가 저장됨
	}
		
	public static int sum(int s, int e) {
		int sum = 0 ;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
	//for문의 사이클이 다돌면  k는 소멸됨		
		}
		return sum; // 마지막 sumdms 14의 result로 들어감 그 후에 메서드에 저장된 값들은 사라짐
	}
	
		//stack
		
		

}
