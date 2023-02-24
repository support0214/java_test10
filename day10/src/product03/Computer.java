package product03;

public class Computer extends Product{

	Computer(){
		super(200);
	}
	// 최고 조상인 Object 클래스
	@Override
	public String toString() {
		return "Computer";
	}
}
