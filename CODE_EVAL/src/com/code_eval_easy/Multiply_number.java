package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.*;

// 5/11/16 correct version
public class Multiply_number {
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) !=null){
			String[] str = line.trim().split(",");			
			int first = Integer.valueOf(str[0]);
			int second = Integer.valueOf(str[1]);
			int total = second;
			while (total < first) {
				total += second;
			}
			System.out.println(total);
		}
		br.close();
	}
}

// 4/21/16  - partial correct

/*
public class Multiply_number {

	public static void main(String[] args) throws IOException {
		
		File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
        	//System.out.println("line " + line);
        	String[] str = line.split(",");
        	int first_num=Integer.parseInt(str[0]);
        	//System.out.println("first  " + first_num);
        	int power_num=Integer.parseInt(str[1]);
        	//System.out.println("power  " + power_num);
        	// Math.log is 2 based.
        	// log2(X)=logK(X)/logK(2) where K can be any numer. let's use 2
        	int logn = (int) (Math.log(power_num)/Math.log(2));// this is how you get log value
        	//System.out.println("logn  " + logn);
        	int ret=(int) Math.pow(2,logn);
        	while (ret < first_num) {
        		logn++;
        		ret=(int) Math.pow(2,logn);       		
        	}
        	System.out.println(ret);
        }

	}

}
*/
