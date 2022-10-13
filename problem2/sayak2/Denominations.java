package com.gl.LabAssignment2.problem2.sayak2;

public class Denominations {


	int denominations[];
	int paymentamt;
	private boolean outcome;
	public Denominations(int denominations[],int paymentamt) {
	this.paymentamt=paymentamt;
             	this.outcome=false;this.denominations=denominations;
            	this.paymentamt=paymentamt;
            	this.outcome=false;
}
public void calculate() {
	StringBuilder result=new StringBuilder();
	int tempamt=paymentamt; 
	for(int index=0;index<denominations.length;index++)
	{
		int denominationval=denominations[index];
		int Quotient=tempamt/denominationval;
		int Remainder=tempamt%denominationval;
		if(Quotient!=0)
		{
			result.append(String.format("denomination value %d, denominationcount %d ",denominationval,Quotient));
			result.append(System.getProperty("line.separator"));
			tempamt=Remainder;
		}
		if(Remainder==0)
		{
			this.outcome=true;
			break;
		}
		}
		if(outcome) 
		{
			System.out.println("Success");
			System.out.println(result);
		}else {
			System.out.println("Fail");
		}
		
}
}


