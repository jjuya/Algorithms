package Sorting._1BigSorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	static boolean myfunc(String i, String j) {
		
		BigInteger n = BigInteger.valueOf(Long.parseLong(i));
		BigInteger m = BigInteger.valueOf(Long.parseLong(j));
	    
	    if(n.compareTo(m) < 0) {
	    	return false;
	    } else {
	    	return true;
	    }
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        String[] unsorted = new String[n];
        
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
            System.out.println(unsorted[unsorted_i]);
        }
        
        //Solve
        sort(unsorted[0], unsorted[n - 1], myfunc());
        
    } //end main
} //end class

