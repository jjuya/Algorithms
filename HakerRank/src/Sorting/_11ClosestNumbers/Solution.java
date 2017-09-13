package Sorting._11ClosestNumbers;

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
		
		// find min diff
		StringBuffer result = new StringBuffer();
		
		Arrays.sort(ar);
		
		int diff = Integer.MAX_VALUE;
		
		for(int i = 1; i < size; i++) {
			
			int temp = ar[i] - ar[i - 1];
			
			if(temp == diff) {
				result.append(ar[i - 1] + " " + ar[i] + " ");
			} else if(temp < diff) {
				diff = temp;
				result.delete(0, result.length());
				result.append(ar[i - 1] + " " + ar[i] + " ");
			}
		}
		
		System.out.println(result);
		
	} //end main
} //end class