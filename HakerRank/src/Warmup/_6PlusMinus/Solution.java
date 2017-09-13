package Warmup._6PlusMinus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        //Solve
        int[] integers = {0, 0, 0};
        
        for(int num : arr) {
        	if(num > 0) {
        		integers[0]++;
        	} else if(num < 0) {
        		integers[1]++;
        	} else {
        		integers[2]++;
        	}
        }
        
        for(int i : integers) {
        	double result = (double)i / n;
        	System.out.println(result);
        }
        
    } //end main
} //end class
