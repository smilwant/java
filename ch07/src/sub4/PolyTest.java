package sub4;

/*
 * ��¥ : 2019/06/12
 * �̸� : ��ȫ��
 * ���� : Ŭ���� ��� �ǽ��ϱ� p288
 */
//������ : �θ�Ŭ���� ���� = new �ڽ�Ŭ���� ();

public class PolyTest {

	public static void main(String[] args) {
		Animal t = new Tiger();  
		Animal e = new Eagle();
		Animal s = new Shark();
	 //�θ�Ŭ���� ���� = new �ڽ�Ŭ����(); 
		t.move(); // �������� �� ��� ���������� �θ� Ŭ����������  
		t.hunt(); // �ڽ� Ŭ���� ���� ���� �Ǿ��ֱ⶧���� �θ�Ŭ�������� ���� �������
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();

	}
}