package Sorting._10TheFullCountingSort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		/* Enter your code here. 
		 * Read input from STDIN. Print output to STDOUT. 
		 * Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);

		int size = Integer.parseInt(sc.nextLine());

		//  0 <= x <100
		StringBuffer[] st=new StringBuffer[100]; 

		for(int i = 0; i < 100; i++) {
			st[i]  =new StringBuffer();
		}

		for(int i = 0; i < size; i++) {
			String temp = sc.nextLine();

			String[] str = temp.split("\\s");
						
			int x = Integer.parseInt(str[0]);
			
			String s = str[1] + " ";
			
			if(i < (size / 2)) {
				s = "- ";
			}
			st[x] = st[x].append(s); 
		}

		for(int i = 0; i < 100; i++) {
			
			System.out.print(st[i]);
		}

	} //end main
} //end class