package polymorphism01;

class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
public class PolymorphismTest1 {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// 다형성 : class 자동 형변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		
		C c1 = e;
		
	}
}