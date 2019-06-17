package sub1;

/* 
 *날짜 : 2019/06/05
 *이름 :이홍석 
 *내용 : 다차원 배열 실습하기 교재 p149 
 */
public class MultiArrayTest {

	public static void main(String[] args) {
//1차원 배열 
		int[] score = { 80, 90, 75, 45, 89 };

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("점수의 합 : " + sum);
//배열 반복문 
		int[] math = { 60, 72, 78, 82, 96 };
		int total = 0;

		for (int m : math) { // 반복하는 횟수를 math의 순서대로 대입하면서
			total += m;
		}

		System.out.println("수학점수 합 :" + total);

//2차원 배열 
		int[][] arr2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		for(int a=0; a<4; a++) {
			for(int b=0; b<3; b++) {
				System.out.println("arr2d["+a+"]["+b+"] :"+arr2d[a][b]);
			}
		}
		
		System.out.println("arr2d[0][0]: " + arr2d[0][0]);
		System.out.println("arr2d[0][1]: " + arr2d[0][1]);
		System.out.println("arr2d[0][2]: " + arr2d[0][2]);

		System.out.println("arr2d[1][0]: " + arr2d[1][0]);
		System.out.println("arr2d[1][1]: " + arr2d[1][1]);
		System.out.println("arr2d[1][2]: " + arr2d[1][2]);

		System.out.println("arr2d[2][0]: " + arr2d[2][0]);
		System.out.println("arr2d[2][1]: " + arr2d[2][1]);
		System.out.println("arr2d[2][2]: " + arr2d[2][2]);

		System.out.println("arr2d[3][0]: " + arr2d[3][0]);
		System.out.println("arr2d[3][1]: " + arr2d[3][1]);
		System.out.println("arr2d[3][2]: " + arr2d[3][2]);

	}

}
