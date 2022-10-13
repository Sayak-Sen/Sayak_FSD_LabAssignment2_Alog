package com.gl.LabAssignment2.problem2.sayak2;

import java.util.Scanner;

public class Denominations1  {
	

	
		static void test1(int[]denominations,int paymentamt) {
	
		               System.out.println("____________________________________________________________");
		     			Denominations cal=new Denominations(denominations,paymentamt);
		     			cal.calculate();
		             	
		             }
		         
			
			
			
	
		
		public static void main(String [] args) {
		
			test1(new int[] {5,1,10},12);
			//test1(new int[] {78,60,25,12,5,},128);
			//test1(new int[] {123,18,12,5},158);
			
		}

	}



