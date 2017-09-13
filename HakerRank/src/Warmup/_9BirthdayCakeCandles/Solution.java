package Warmup._9BirthdayCakeCandles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int height = 0;
        int max = 0;
        int result = 0;
        
        
        for(int i = 0; i < n; i++){
        	height = in.nextInt();
        	
        	if(height > max) {
        		max = height;
        		result = 1;
        	} else if(height == max) {
        		result++;
        	}
        }
        
        System.out.println(result);
    } //end main
} //end class