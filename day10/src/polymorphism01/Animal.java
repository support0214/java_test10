package polymorphism01;

class Animal01{

	void breathe() {
		System.out.println("울음소리");
	}
	void sound() {
		System.out.println("동물소리");
	}
}
class Dog extends Animal01{
	
		@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal01{
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
public class Animal {
	public static void main(String[] args) {
		Animal01 An1;
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		An1 = dog1;
		dog1.sound();
		
		An1 = cat1;
		cat1.sound();
		
		cat1 = (Cat)An1;
		cat1.breathe();
		
		Animal01 a2 = new Animal01();
	//	cat1 = (Cat)a2; 강제형변환 안됨 Animal01 객체만 생성되어 있기 때문(Cat객체가 없음)
		
		// 클래스명 instanceOf 클래스명 
		// 왼쪽의 객체가 오른쪽의 객체의 타입으로 만들어졌느냐를 검사
		
		Animal01 a3 = new Cat();
		if(a3 instanceof Cat) {
			Cat cat11 = (Cat)a3;
			System.out.println("자식클래스로 변환됨");
		} else {
			System.out.println("자식클래스로 강제형변환할 수 없음");
		}
		
		Animal01 a4 = new Animal01();
		if(a4 instanceof Cat) {
			Cat cat11 = (Cat)a4;
			System.out.println("자식클래스로 변환됨");
		}else {
			System.out.println("자식클래스로 강제형변환 안됨");
		}
	}

}
