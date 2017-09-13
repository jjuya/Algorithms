package Sorting._7Quicksort1_Partition;

import java.io.*;
import java.util.*;

public class Solution {

	static void partition(int[] ar) {

		int equal = ar[0];
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] < equal) {
				left.add(ar[i]);
			} else if(ar[i] > equal) {
				right.add(ar[i]);
			}
		}
		
		printArray(left);
		System.out.print(equal + " ");
		printArray(right);
		
	} //end function

	static void printArray(List<Integer> left) {
		for(int n: left){
			System.out.print(n+" ");
		}
		
	} //end function

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt(); 
		}
		
		partition(ar);
	} //end main
} //end class

