package sub2;

/*
 * 날짜 : 2019/06/04
 * 이름 : 이홍석
 * 내용 : 반복문 실습하기 교재 p119
 * 
 */
public class ForTest {
	public static void main(String[] args) {
		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d"); // 세로방향으로
		System.out.println("e");
		
		System.out.print("ㄱ");
		System.out.print("ㄴ");// 가로방향으로     \n 사용시 줄바꿔줌 
		System.out.print("ㄷ");
		System.out.print("ㄹ\n");
		
		
		
		
		// for문
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello world■");
		}
		// 1부터 10까지 합
		int sum = 0;
		for (int k = 1; k <= 10; k++) {
			sum = +k; // k값에 1에서부터 10까지를 더해서 sum에 저장해줌
		}
		System.out.println("1부터 10까지 합 : " + sum);
		// 1부터 10 까지 짝수 합
		int tot = 0;

		for (int k = 1; k <= 10; k++) {
			if (k % 2 == 0) {
				tot += k;
		}
	}
	System.out.println("1부터 10까지 짝수합 : " +tot);
		// 중첩 for문
		for (int a = 1; a <= 3; a++) {
			System.out.println("a : " + a);
			for (int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}//a를실행 1 b를 5번 실행 a를실행 2 b 를  5번 실행 반복
	}

		// 구구단 출력

		for (int a = 1; a <= 9; a++) {
			System.out.println(a + "단 출력");
			for (int b = 1; b <= 9; b++) {

				int c = a * b;
				System.out.println(a + "x" + b + "=" + c);

			}
		}
			
//별삼각형 출력 
		for (int start = 10; start >= 1; start--) {
			for (int end = 1; end <= start; end++) {
				System.out.print("★");

			}
			System.out.print("\n"); // new line 줄바꿈 = \n 으로 별갯수를 출력후 다음줄로 바꿈
		}
		
		
		
		
		
		
		
		
	
	
	
	
}
}