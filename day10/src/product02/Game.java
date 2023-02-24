package product02;

public class Game extends Product{

	Game(){
		super(50);
	}
	// 최고 조상인 Object 클래스
	@Override
	public String toString() {
		return "Game";
	}
}
