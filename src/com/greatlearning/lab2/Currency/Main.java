package com.greatlearning.lab2.Currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Enter the size of currency denominations");
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();
			int notes[] = new int [size];

			System.out.println("\n Enter the currency denominations value");

			for(int i=0; i<size; i++) {
				notes[i] = scanner.nextInt();
			}

			System.out.println("\n Enter amount you want to pay");

			int amount = scanner.nextInt();
			MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();

			mergeSortImplementation.sort(notes, 0, notes.length-1);

			NoteCounts noteCounts = new NoteCounts();
			noteCounts.noteCounterImplementation(notes, amount);
		}
	}

}
