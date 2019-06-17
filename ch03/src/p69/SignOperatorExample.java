package p69;

public class SignOperatorExample {
public static void main(String[] args) {
	int x = -100;
	int result1 = +x; // 피연산자의 부호 유지
	int result2 = -x; // 피연산자의 부호 변경 
	System.out.println("result1="+result1);
	System.out.println("result2="+result2);
	
	short s = 100; 
	int result3 = -s;   // short부호연산시  int타입값으로  바뀜 
	System.out.println("result3="+result3);
}
}
