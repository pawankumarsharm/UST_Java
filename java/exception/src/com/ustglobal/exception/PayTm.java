package com.ustglobal.exception;

public class PayTm {
void book() {
	System.out.println("PayTm started");
	
	IRCTC i=new IRCTC();
	i.confirm();
	
	System.out.println("PayTm ended");
}
}
