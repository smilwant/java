package sub3;

public class Addler {

	public int x; // �ԷµǸ� �ʱ� x=0���� ����� 

	public void add(int x) {
		this.x = x + 50; // ��������� �����ʿ��� �������ν���� 
	}
// x�� 100���� ����� �� 150�� ����ǰ� �����鼭  stack �� x�� ����� 
	public void add(int[] arr) {
		arr[0]++;

	}
// heap�� ����� [0]���� ����Ȱ��� 1�̰� ++ ���ֹǷ� 2��� 
	public void add(Addler a1) {
		a1.x = a1.x + 40;
// ���ο� �ּҰ��� �޾ƿͼ� stack�� ���� �� �ּҰ��� ����Ǹ� heap�� ����Ȱ��� �����ͼ��� ������ �Ҹ�  
	}

	public Addler addNew(Addler a2) {
		a2 = new Addler();
		return a2;
	}

}
