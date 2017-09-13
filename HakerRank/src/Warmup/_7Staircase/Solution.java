package Warmup._7Staircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        //Solve
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= n - i; j++) {
        		System.out.print(" ");
        	}
        	
        	for(int j = 1; j <= i; j++) {
        		System.out.print("#");
        	}
        	System.out.println();
        }
        
    } //end main
} //end class