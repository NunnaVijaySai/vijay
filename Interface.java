package javalab;
/*interface A{
	void show();
	void config();
	
}
class B implements A{
	public void show() {
		System.out.println("Krishna");
	}
	public void config() {
		System.out.println("VJ");
	}
}
public class Interface {

	public static void main(String[] args) {
		B ob=new B();
		ob.show();
		ob.config();

	}

}*/



/*interface A{
	void show();
	void config();
	
}
class B implements A{
	public void show() {
		System.out.println("Krishna");
	}
	public void config() {
		System.out.println("VJ");
	}
}
public class Interface {

	public static void main(String[] args) {
		A ob=new B();
		ob.show();
		ob.config();

	}

}*/



//Static//
/*interface A{
	int age=19;
	String area="Andhrapradesh";
}	
public class Interface {

	public static void main(String[] args) {
		System.out.println(A.area);
		System.out.println(A.age);
		

	}

}*/




interface A{
	void show();
	void config();
	
}
interface X{
	void run();
}
interface Y extends X{
	
}
class B implements A,X{
	public void show() {
		System.out.println("Krishna");
	}
	public void config() {
		System.out.println("VJ");
	}
	public void run() {
		System.out.println("This is VJ the developer ");
	}
}
public class Interface {

	public static void main(String[] args) {
		B ob=new B();
		ob.show();
		ob.config();
	    ob.run();

	}

}