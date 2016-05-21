package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 5/10/16

public class bit_position {
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()){
				String line = in.nextLine();
				String[] str = line.split(",");
				int value=Integer.valueOf(str[0]);
				int p1=Integer.valueOf(str[1]);
				int p2=Integer.valueOf(str[2]);
				int p1_val=value;
				int p2_val=value;
				int p1_rem,p2_rem;
				for (int i=1; i<p1; i++){
					p1_val = p1_val/2;
				}
				p1_rem=p1_val%2;
				for (int i=1; i<p2; i++){
					p2_val = p2_val >> 1; // divide by 2
				}
				p2_rem=p2_val%2;
				boolean b = (p1_rem == p2_rem) ? true : false;
				System.out.println(b);
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// 4/23/16
/* similar solution

public class bit_position {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		try {
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine())!= null) {
				String[] str = line.trim().split(",");
				int num=Integer.parseInt(str[0]);
				int p1=Integer.parseInt(str[1]);
				int p2=Integer.parseInt(str[2]);
				// get p1 position
				for (int i=1; i< p1; i++){
					num = num/2;
				}
				int p1_val=num % 2;
				// get p2 position
				int diff = p2 - p1;
				for (int i=1; i<=diff; i++){
					num = num/2;
				}
				int p2_val=num%2;
				if (p1_val == p2_val)
					System.out.println("true");
				else
					System.out.println("false");
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
*/