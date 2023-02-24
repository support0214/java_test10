package product03;

public class Audio extends Product{

	Audio(){
		super(70);
	}
	// 최고 조상인 Object 클래스
	@Override
	public String toString() {
		return "Audio";
	}
}
