
public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name, int eid) {
		this.name=name;
		this.eid=eid;
	}
	void printDetails() {
		System.out.println("Employeee name is"+name);
		System.out.println("Employeee id is"+eid);
		this.sayHello();
	}
	
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to  UST Global Company");
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1("deepika",23);
		e1.printDetails();
		Employee1 e2=new Employee1("alia",456);
		e2.printDetails();
		Employee1 e3=new Employee1("priya",789);
		e3.printDetails();
		
	}
}
