package product02;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
//	void buy(Product p = new Product()) {
//				    	= new Audio()
//						= new Computer()
//						= new Game()
//						= new Tv()
//	}
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하였습니다");
	}
}
