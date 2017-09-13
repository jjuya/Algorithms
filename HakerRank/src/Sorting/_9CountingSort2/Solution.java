package Sorting._9CountingSort2;

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
//    	Collections.sort(ar);
//    	
//    	for(int i = 0; i < size; i++) {
//    		System.out.print(ar.get(i) + " ");
//    	}
    	
    	int[] ar = new int[size];
    	
    	for(int i = 0; i < size; i++) {
    		ar[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(ar);
    	
    	for(int i = 0; i < size; i++) {
    		System.out.print(ar[i] + " ");
    	}
    	
    } //end main
} //end class