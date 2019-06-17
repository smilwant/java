package p71;

public class IncreaseDecreaseOperatorExample {
public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	System.out.println("----------------"); 
	x++; // 다른 연산 수행 후에 피연산자의 값을 1 증가시킴  or --x 피연산자의 값을 1 감소시킴
	++x;  // 피연산자의 값을 1 증가 시킴 or x--피연산자의 값을 1 감소시킴
	System.out.println("x=" +x);

	System.out.println("----------------");
	y--;
	--y;
	System.out.println("y=" +y);

	System.out.println("----------------");
	z = x++;
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	
	System.out.println("----------------");
	z = ++x;
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	
	System.out.println("----------------");
	z = ++x + y++;
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	System.out.println("y=" +y);
	
	
}
}
