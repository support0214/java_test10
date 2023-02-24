package polymorphism01;
class Parent{
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}
class child extends Parent{
	@Override
	void method2() {
		System.out.println("Parent-method2()를 오버라이딩");
	}
	void method3() {
		System.out.println("child-method3()");
	}
	void method4() {
		System.out.println("child-method4()");
	} 
}
public class PolymorphismTest2 {

	public static void main(String[] args) {
		// Parent p1 = new child(); 한줄 요약
		child c1 = new child();
		
		Parent p1 = c1;
		p1.method1(); // 부모타입 메서드만 사용가능
		p1.method2(); // 오버라이딩을 했을경우 부모타입으로 형변환을 했어도 자식것이 호출됨  
		
		// p1.method3(); 자식것은 호출 불가
		
	}
}