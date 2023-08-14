package javalab;

public class Emp {
	int id;
	String name;
	double salary;
	void readEmp(int i,String n,double s) {
		id = 1;
		name = n;
		salary = s;
		
	}
void printEmp() {
	System.out.println("Name: "+ name);
	System.out.println("Id: "+id);
	System.out.println("Salary: "+salary);
	}
public static void main(String[] args) {
	Emp e1 = new Emp();
	e1.readEmp(120,"Vijay",10000000000.00);
	e1.printEmp();
}
}
