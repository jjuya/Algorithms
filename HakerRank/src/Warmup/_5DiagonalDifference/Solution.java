package Warmup._5DiagonalDifference;

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
        int a[][] = new int[n][n];
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        //Solve
        int p_diagonal = 0;
        int s_diagonal = 0;
        
        for(int i = 0; i < n; i++) {
        	p_diagonal = p_diagonal + a[i][i];
        	s_diagonal = s_diagonal + a[i][n - 1 - i];
        }
        
        int result = Math.abs(p_diagonal - s_diagonal);
        
        System.out.println(result);
        
    } //end main
} //end class
