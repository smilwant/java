package sub4;

public class PolyTest2 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();

		Animal obj[] = { t, e, s }; // ��ü�� ������ Ÿ���� �ٸ��� �迭�� ���� �������� ������
		obj[0].move();
		obj[0].hunt();

		obj[1].move();
		obj[1].hunt();

		obj[2].move();
		obj[2].hunt();
		// move(); static �޼��� �̱⶧���� �Ʒ��� move�� static �Ⱥ��̸� ���� �Ұ�
		move(t);
		move(e);
		move(s);

	}// main end
		// overLoading �Ȱ��� ����� �ϴ� Ŭ��������

	public static void move(Animal a) {
		a.move();
	}

	// public static void move(Shark s) {
	// s.move();
	// }
// ���� �ϳ� �ϳ� ������൵������ ���⼺�� �̿��ϸ� Animal �ϳ��� �� Ŀ������ 
}
