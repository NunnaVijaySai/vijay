package javalab;

class Student {
int rollno=39;
String name="vijay";
}
class Studentmarks extends Student{
	int m1=10;
	int m2=20;
	int m3=30;
}
class Studentmemo extends Studentmarks{
	void Certificate() {
		System.out.println("Totalmarks:"+(m1+m2+m3));
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);
	}
}
public class MultiLevelIn{
	public static void main(String[]args) {
		Studentmemo ob=new Studentmemo();
		ob.Certificate();
	}
}