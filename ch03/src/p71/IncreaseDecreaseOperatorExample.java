package p71;

public class IncreaseDecreaseOperatorExample {
public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	System.out.println("----------------"); 
	x++; // �ٸ� ���� ���� �Ŀ� �ǿ������� ���� 1 ������Ŵ  or --x �ǿ������� ���� 1 ���ҽ�Ŵ
	++x;  // �ǿ������� ���� 1 ���� ��Ŵ or x--�ǿ������� ���� 1 ���ҽ�Ŵ
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
