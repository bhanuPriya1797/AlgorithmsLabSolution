package com.greatlearning.lab2.Transaction;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("\n Please enter the size of transaction array:");
			int size = sc.nextInt();
			int array[] = new int[size];
			
			System.out.println("\n Please enter the value of array:");
			int i; 
			for(i=0; i< size; i++ ) {
				
				array[i] = sc.nextInt();
				
			}
			System.out.println("\n Enter the total number of targets that need to be acheived: ");
			int targetNo = sc.nextInt();
			while (targetNo-- !=0) {
				int flag =0;
				int target;
				
				System.out.println("\n Enter the value of Target: ");
				target = sc.nextInt();
				int sum = 0;
				for(i=0; i < size; i++ ) {
					
					sum += array[i];
					if(sum >= target ) {
						System.out.println("\n Target acheived after: " + (i + 1)+ " transactions " );
						flag = 1;
						break;
						
					}
				}
				if(flag == 0) {
					
					System.out.println("Given Tareget is not acheived");
				}
				
				
			}
			
		}
		
	}

}
