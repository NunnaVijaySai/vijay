package javalab;

/*class A{
	int a=30;
	int b=20;
	public void sum() {
		System.out.println(a+b);
	}
}

class B extends A {
	public void sub() {
		System.out.println(a-b);
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.sum();
		ob.sub();
	}

}*/



/*class A{
	int a=30;
	int b=20;
	public void sum() {
		System.out.println(a+b);
	}
}

class B extends A {
	int c=5;
	public void add() {
		System.out.println(a+b+c);
	}
}
class C extends B{
	public void mul() {
		System.out.println(a*b*c);
	}
}

class D extends B{
	public void sub() {
		System.out.println(a-b-c);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		A ob3=new A();
		ob3.sum();
		
		B ob=new B();
		ob.add();
		
		C ob1 = new C();
		ob1.mul();
		
		D ob2 = new D();
		ob2.sub();
	}

}*/





//without overriding
/*class A{
	void greet() {
		System.out.println("Hello thi is VJ");
	}
}
class B extends A{
	void greet() {
		super.greet();
		System.out.println("Welcome to my business world");
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.greet();
	}
}*/


/*class A{
	int a=10,b=20;
	void add() {
		System.out.println(a+b);
	}
}
class B extends A{
	int a=1000,b=2000;
	void add(int a, int b) {
		System.out.println(a+b);
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.add(100,200);
	}
}*/



/*class A{
	int a=10,b=20;
	void add() {
		System.out.println(a+b);
	}
}
class B extends A{
	int a=1000,b=2000;
	void add() {
		System.out.println(a+b);
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.add();
	}
}*/




//with overriding
/*class A{
	int a=10,b=20;
	void add() {
		System.out.println(a+b);
	}
}
class B extends A{
	int a=1000,b=2000;
	void add() {
		System.out.println(a+b);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.add();
	}
}*/