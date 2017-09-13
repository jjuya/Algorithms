package Sorting._3InsertionSort_Part1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function 

		int e = ar[ar.length - 1];

		for(int i = ar.length - 2; i >= 0; i--) {

			if(ar[i] > e) {
				if(i == 0) {
					ar[i + 1] = ar[i];
					printArray(ar);
					
					ar[i] = e;
					printArray(ar);
				} else {
					ar[i + 1] = ar[i];
					printArray(ar);
				}
			} else if(ar[i] < e) {
				ar[i + 1] = e;
				printArray(ar);
				break;
			}
		}

	} //end function

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];

		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}

		insertIntoSorted(ar);
	} //end main

	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n + " ");
		}

		System.out.println("");
	} //end function
} //end class

