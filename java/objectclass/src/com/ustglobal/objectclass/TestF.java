package com.ustglobal.objectclass;

public class TestF {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"pawan",100000);
		Employee e2=new Employee(2,"priya",500000);
		Employee e3=new Employee(3,"pawan",100000);
		Employee e4=e3;
		
		 boolean isEqual=e1.equals(e2);
		    System.out.println(e1.equals(e3));
		    System.out.println(e3.equals(e4));
		    
		    System.out.println(isEqual);
	}

}
