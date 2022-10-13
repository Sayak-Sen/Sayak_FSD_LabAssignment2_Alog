package com.gl.LabAssignment2.problem2.sayak2;

import java.util.Scanner;


 class Array{
	int size;
	
	 Array(int x) {
		size=x;
		Scanner sc=new Scanner(System.in);
		int[]denominations=new int[size];
		System.out.println("putting the values in the denomination array: ");
		for(int j=0;j<denominations.length;j++)
		{
			denominations[j]=sc.nextInt();
		
		}
		System.out.println("_______________________________________________________________________________");
	 
		
		
			System.out.print("denomination list is ----->[ ");
		for(int j=0;j<denominations.length;j++)
		{
			System.out.print(denominations[j]+" ");
		}
		System.out.println("]");
	
		System.out.println("_______________________________________________________________________________");
	
		System.out.print("Sorting list is -----> [ ");
		for (int i = 0; i < denominations.length; i++) 
	    {      //Loop over java Array  outer Loop use
	        for (int j = i + 1; j < denominations.length; j++) 
	        {  // Loop over java array
	            int tmp = 0;                            //tempraory variable in order to compare.
	            if (denominations[i] > denominations[j]) 
	            {          //compare outer loop object with inner loop 
	                tmp = denominations[i];               // if greater than swapping.
	                denominations[i] = denominations[j];            // Swaping code here.
	                denominations[j] = tmp;
	            }
	        }
	    }
	           // After Sorting Printing The Value.............

	           for (int i = 0; i < denominations.length; i++) 
	           {     
	              System.out.print(denominations[i]+ " ");  
	           }
	           System.out.println(" ]");
	           
	} 
 }
	  public class Sort {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		Array ar=new Array(size);
		int payment=sc.nextInt();
		
		
	    
	}}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	


