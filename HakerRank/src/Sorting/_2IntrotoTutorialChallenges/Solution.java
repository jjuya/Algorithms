package Sorting._2IntrotoTutorialChallenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	//Solve
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int V = sc.nextInt();
    	
    	int size = sc.nextInt();
    	int[] arr = new int[size];
    	
    	for(int i = 0; i < size; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int result = findV(arr, V);
    	
    	System.out.println(result);
    	
    } //end main

	static int findV(int[] arr, int V) {
		
		for(int i = 0; i < arr.length; i++) {
    		if(arr[i] == V) {
    			return i;
    		}
    	}
		
		return -1;
	}
} //end class