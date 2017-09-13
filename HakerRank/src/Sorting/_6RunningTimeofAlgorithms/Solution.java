package Sorting._6RunningTimeofAlgorithms;

import java.io.*;
import java.util.*;

public class Solution {
	
	static int runningTime(int[] arr) {
		
		int count = 0;
		
		for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            
            int j = i - 1;
            
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = value;
        }
		
		return count;
	} //end function

    public static void main(String[] args) {
        /* Enter your code here. 
         * Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int size = sc.nextInt();
    	
    	int[] arr = new int[size];
    	
    	for(int i = 0; i < size; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int result = runningTime(arr);
    	
    	System.out.println(result);
    } //end main

	
} //end class

