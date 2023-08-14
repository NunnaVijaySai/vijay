package javalab;

import java.util.Scanner;

/*Instance variable*/


/*public class Inst {
	int a=100;
	double b=50000.0;
	String name="Vijay";

	public static void main(String[] args) {
		Inst s=new Inst();
		System.out.println("Enter the int a:" +s.a);
		System.out.println("enter the double b:"+s.b);
		System.out.println("Enter the string name"+s.name);

	}

}*/

/*static variable*/

/*public class Inst {
	 static int a=100;
	static double b=50000.0;
	static String name="Vijay";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);

	}

}*/

/*static variable with the class name of dot variable */

/*class A{
	static int a=500;
	static double b=50000.0;
	static String clgname="codegnan";
	
}
class Inst {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.clgname);
		
	}
}*/



/*import java.util.Scanner;
class Inst{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a and b values :");
		int a=s.nextInt();
		int b=s.nextInt();
		int d=a*b;
		System.out.println("The Int value:"+d);
	}
}*/

/*import java.util.Scanner;
class Inst{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter radius of a circle :");
		float r=s.nextFloat();
		double ar=Math.PI*r*r;
		double cr=2*Math.PI*r;
		System.out.println("The area :"+ar);
		System.out.println("The circumference:"+cr);
	}
}*/