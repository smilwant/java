package sub3;

public final class BBB extends AAA {

	@Override
	public void md1() {
		System.out.println("BBB - md1()");
	}
	
	// Overloading
	// final 메서드 : override 할 수 없다.
	public final void md2(int a) {
		System.out.println("BBB - md2()");
	}
	
}
