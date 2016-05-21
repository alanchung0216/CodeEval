package com.code_eval_easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 5/10/16
public class fizz_buzz {
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()){
				String line = in.nextLine();
				String[] str = line.split(" ");
				int fizz=Integer.valueOf(str[0]);
				int buzz=Integer.valueOf(str[1]);
				int value=Integer.valueOf(str[2]);
				for (int i=1; i<=value; i++){
					if ((i % fizz == 0) && (i % buzz == 0)) 
						System.out.printf("%s","FB");
					else if (i % fizz == 0)
						System.out.printf("%s","F");
					else if (i % buzz == 0)
						System.out.printf("%s","B");
					else
						System.out.printf("%d",i);
					if (i==value)
						System.out.printf("%n");
					else
						System.out.printf(" ");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// 4/20/16
/* 
public class fizz_buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File(args[0]);
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(file);
			int n=0;
			int fizz=0;
			int buzz=0;
			while (sc.hasNext()) {
				String line = sc.nextLine();
				//System.out.println(line);
				// tokenize
				String[] str = line.split(" ");
				
				fizz=Integer.parseInt(str[0]);
				buzz=Integer.parseInt(str[1]);
				n=Integer.parseInt(str[2]);
				//System.out.println("  " +fizz+ " " + buzz + " "+n);
				int[] arr=new int[n];
				for (int i=0; i<n; i++){
					arr[i]=i+1;
				}
				for (int i=0; i<arr.length; i++){
					if (((arr[i] % fizz)==0) && ((arr[i] % buzz)==0))
						System.out.print("FB");
					else if ((arr[i] % fizz)==0) System.out.print("F");
					else if ((arr[i] % buzz)==0) System.out.print("B");					
					else  System.out.print(arr[i]);
					
					if (i == arr.length -1) break;
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
*/