package polymorph;

class A{
	public void show() {
		System.out.println("in A show");
	}
}

class B extends A{
	public void show() {
		System.out.println("in B show");
	}
}

class C extends A{
	public void show() {
		System.out.println("in C show");
	}
}

public class Example {

	public static void main(String[] args) {
		 A obj = new A();
		 obj.show();
//		 type as parent and object as child
		 
		 obj = new B();
		 obj.show();
		 
		 obj = new C();
		 obj.show();
	}

}
