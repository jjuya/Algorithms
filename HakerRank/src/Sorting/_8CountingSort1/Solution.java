package Sorting._8CountingSort1;

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
    	
    	int size = sc.nextInt();
    	
//    	ArrayList<Integer> ar = new ArrayList<Integer>();
//
//    	for(int i = 0; i < size; i++) {
//    		ar.add(sc.nextInt());
//    	}
//    	
//    	for(int i = 0; i < size; i++) {
//    		System.out.print(Collections.frequency(ar, i) + " ");
//    	}
    	
    	int[] count = new int[100];
    	
    	for(int i = 0; i < size; i++) {
    		count[sc.nextInt()]++;
    	}
    	
    	for(int i = 0; i < 100; i++) {
    		System.out.print(count[i] + " ");
    	}
    	
    } //end main
} //end class