
public class Employee2 {
	String name;
	int eid;
	long adharno;
	
	Employee2(String name, int eid, long adharno){
		this.name=name;
		this.eid=eid;
		this.adharno=adharno;
	}
	
	Employee2(String name, int eid){
		this.name=name;
		this.eid=eid;
	}
	Employee2(int eid,String name){
		this.name=name;
		this.eid=eid;
	}
	void printDetails()
	{
		System.out.println("Hi "+name+ " welcome to Ust global");
	}
	public static void main(String[] args) {
		
	}

}
