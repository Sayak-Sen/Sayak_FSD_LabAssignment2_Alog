package com.gl.LabAssignment2.problem1.sayak1;
import java.util.Scanner;
public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("marks 8");
		System.out.println("SOLUTION");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.test for two targets of n size array");
		System.out.println("2.test for one target of 1 size array ");
		System.out.println();
		System.out.print("enter the option from the  list ");
		int option=sc.nextInt();
		System.out.println();
		
		//Switch option is used
		
		
		
		//array creation
		
		switch(option)
		{
		case 1:
		System.out.print("enter the transaction array of n size except 1 for 2 tergets checking ");
		int transactionsize=sc.nextInt();
		System.out.println();
		int []transaction=new int[transactionsize];			
		System.out.println("putting the values in the transaction array: ");
		for(int j=0;j<transaction.length;j++)
		{
			transaction[j]=sc.nextInt();
		
		}
		System.out.println("_______________________________________________________________________________");
		System.out.print("transaction list is ----->[ ");
		for(int j=0;j<transaction.length;j++)
		{
			System.out.print(transaction[j]+" ");
		}
		System.out.println("]");
		System.out.println("______________________________________________________________________________");
		
		
		
		//checking the target value
		
		// first target
		System.out.print("enter the first target value ");
		int	first_target=sc.nextInt();
		int sum=0;
		for(int i=0;i<transaction.length;i++)
		{
			
			sum=sum+transaction[i];
			if(sum>=first_target)
			{

				System.out.println("daily target"+first_target+ "is achived after "+(i+1)+" transaction");
				break;
			}}
			if(sum<first_target)
			{System.out.println("daily target " +first_target + "is achived after 1 transaction");}
		
			
			
			
		//same logic used here for second target
			System.out.print("enter the second target value ");
			int	second_target=sc.nextInt();
			sum=0;
			for(int i=0;i<transaction.length;i++)
			{
				sum=sum+transaction[i];
				if(sum>=second_target)
				{
					System.out.println("daily target"+second_target+ "is achived after "+(i+1)+" transaction");
					break;
				}}
			if(sum<second_target)
			{System.out.println("daily target " +second_target + "is achived after 1 transaction");}
			
				System.out.println("_____________________________________________________________");
				break;
		
		
		//same logic used here for 1 size array
		
		case 2:
				System.out.println("A new transaction array of size 1 ");
				System.out.print("enter the size  ");
				int size=sc.nextInt();
				int[]transaction_arr=new int[size]; 	//array is also applicable except 1 size array 
				System.out.print("enter the value into the new array: ");
				for(int i=0;i<size;i++)
				{
					transaction_arr[i]=sc.nextInt();
				}
				System.out.println("____________________________________________________________________");
				System.out.print("the transaction list is [ ");
				for(int i=0;i<size;i++)
				{
					System.out.print(transaction_arr[i]+" ");
				}
				System.out.println(" ]");
				System.out.println("_________________________________________________________________");
				System.out.print("enter the value of the target: ");
				int target=sc.nextInt();
				sum=0;
				for(int i=0;i<transaction_arr.length;i++)
				{
					sum=sum+transaction_arr[i];
					if(sum>=target)
					{
						System.out.println("daily target"+target+ "is achived after "+(i+1)+" transaction");
						break;
					}}
				if(sum<target)
				{System.out.println("given target is not achived");}
				
				}}}

	/*outputs
	
marks 8
SOLUTION

1.test for two tergets of n size array
2.test for one terget of 1 size array 

enter the option from the  list 1

enter the transaction array of n size except 1 for 2 tergets checking 3

putting the values in the transaction array: 
20
12
31
_______________________________________________________________________________
transaction list is ----->[ 20 12 31 ]
______________________________________________________________________________
enter the first target value 21
daily target21is achived after 2 transaction
enter the second target value 19
daily target19is achived after 1 transaction
_____________________________________________________________


marks 8
SOLUTION

1.test for two targets of n size array
2.test for one target of 1 size array 

enter the option from the  list 2

A new transaction array of size 1 
enter the size  1
enter the value into the new array: 100
____________________________________________________________________
the transaction list is [ 100  ]
_________________________________________________________________
enter the value of the target: 101
given target is not achived
*/