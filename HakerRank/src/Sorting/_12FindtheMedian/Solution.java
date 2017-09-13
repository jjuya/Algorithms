package Sorting._12FindtheMedian;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


	public static void main(String[] args) {
		/* Enter your code here. 
		 * Read input from STDIN. Print output to STDOUT. 
		 * Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);

		int size = Integer.parseInt(sc.nextLine());
		
		int[] ar = new int[size];
		
		for(int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
		}
		
		// find median
		
		Arrays.sort(ar);
		
		System.out.println(ar[size / 2]);
		
	} //end main
} //end class