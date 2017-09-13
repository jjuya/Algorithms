package Sorting._5CorrectnessandtheLoopInvariant;

import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            
            int j = i - 1;
            
            //Solve : while(j > 0 && A[j] > value) => while(j >= 0 && A[j] > value)
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
                
                printArray(A);
            }
            A[j + 1] = value;
        }

        printArray(A);
    } //end function

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    } //end function
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    } //end main
} //end class

