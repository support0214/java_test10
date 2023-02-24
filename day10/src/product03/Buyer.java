package product03;

public class Buyer {
	int money = 500;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	
//	void buy(Product p = new Product()) {
//				    	= new Audio()
//						= new Computer()
//						= new Game()
//						= new Tv()
//	}
	int i;
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "를 구입하였습니다");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		// 배열에서만 쓰는 향상된 for문
		for(Product i : cart) {
			if(i == null)
				break;
			sum += i.price;
			itemList += i + ",";
		}
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입 물품들 : " + itemList);
	}
}
