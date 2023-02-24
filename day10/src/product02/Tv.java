package product02;

public class Tv extends Product{

	Tv(){
		super(100);
	}
	// 최고 조상인 Object 클래스
	@Override
	public String toString() {
		return "Tv";
	}
}
