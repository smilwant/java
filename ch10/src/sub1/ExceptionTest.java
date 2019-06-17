package sub1;

/*
 * 날짜 : 2019/06/14
 * 이름 : 이홍석
 * 내용 : 예외처리 실습하기 교재 p422
 */

public class ExceptionTest { // try catch 문 = 중간에 오류가 나더라도 그부분만 잡고 넘어가서 실행
	public static void main(String[] args) {// 시작
		int num1 = 1;
		int num2 = 0;
		int num3 = 3;
		int num4 = 4;

		int rs1=0 ,rs2 =0 ,rs3= 0 ,rs4 = 0;
		
		
		try {
			//에러가 발생할 수 있는 코드블럭  
		 rs1 = num1 + num2;
		 rs2 = num1 - num2;
		 rs3 = num2 * num3;
		 rs4 = 0; // try{} 안에서 선언된걸 변수형태 지우고 다시 작성

		} catch (Exception e) { // 에러가 발생 했을때 처리할 코드블럭
			System.out.println("에러발생");
		}
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);

		System.out.println("프로그램 종료..."); // 종료
	}
}
