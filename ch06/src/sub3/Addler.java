package sub3;

public class Addler {

	public int x; // 입력되면 초기 x=0으로 저장됨 

	public void add(int x) {
		this.x = x + 50; // 실행순서는 오른쪽에서 왼쪽으로실행됨 
	}
// x가 100으로 저장된 후 150이 저장되고 끝나면서  stack 의 x는 사라짐 
	public void add(int[] arr) {
		arr[0]++;

	}
// heap의 저장된 [0]번의 저장된값이 1이고 ++ 해주므로 2출력 
	public void add(Addler a1) {
		a1.x = a1.x + 40;
// 새로운 주소값을 받아와서 stack에 생성 후 주소값이 저장되며 heap의 저장된값을 가져와서씀 끝나면 소멸  
	}

	public Addler addNew(Addler a2) {
		a2 = new Addler();
		return a2;
	}

}
