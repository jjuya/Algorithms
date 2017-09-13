package Warmup._8MiniMaxSum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        //Solve
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
        	
        	long sum = 0;
        	
        	for(int j = 0; j < arr.length; j++) {
            	if(i != j) {
            		sum = sum + arr[j]; 
            	}
            }
        	
        	if(min >= sum) {
        		min = sum;
        	}
        	
        	if(max <= sum) {
        		max = sum;
        	}
        }
        
        System.out.println(min + " " + max);
        
    } //end main
} //end class