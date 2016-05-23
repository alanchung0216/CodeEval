package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 5/11/16
public class reverse_add {
	static Integer reverseVal(Integer val){
		String str = String.valueOf(val);
		char[] ca = str.toCharArray();
		for (int i=0; i<ca.length/2; i++){
			char temp=ca[i];
			ca[i]=ca[ca.length-1-i];
			ca[ca.length-1-i] = temp;
		}
		str = String.valueOf(ca);
		return Integer.valueOf(str);
		//str = new String(ca); // another way
		//return Integer.parseInt(str); //OK
		//return Integer.valueOf(str); // OK
	}
	static boolean is_pal(int sum){
		String str = String.valueOf(sum);
		char[] ca = str.toCharArray();
		//boolean pal = true;
		for (int i=0; i< ca.length/2; i++){
			if (ca[i] != ca[ca.length-1-i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()){
				String line = in.nextLine();
				line = line.trim();
				//System.out.println(line);
				Integer value= Integer.valueOf(line);
				if (value > 10000) continue;
				Integer value_r= reverseVal(value);
				Integer sum = value + value_r;
				int count = 1;
				while (is_pal(sum) == false) {
					Integer sum_r = reverseVal(sum);
					sum = sum + sum_r;
					count++;
				}
				System.out.println(count+" "+sum);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 4/21/16
/*

public class reverse_add {

	public static Integer reverseInt(Integer n) {
		String str = n.toString();
		char[] ca = str.toCharArray();
		for (int i=0; i < ca.length/2; i++){
			char temp=ca[ca.length-1-i];
			ca[ca.length-1-i] = ca[i];
			ca[i] = temp;			
		}
		str = new String(ca);
		return Integer.parseInt(str);		
	}
	
	public static boolean is_palindrome(Integer n){
		String str = String.valueOf(n);
		char[] ca = str.toCharArray();
		for (int i=0; i<ca.length/2; i++){
			if (ca[i] != ca[ca.length-1-i]) return false;
		}
		return true;
	}
		
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) != null){
			line = line.trim();
			Integer num = Integer.parseInt(line);
			if (num >= 10000) continue;
			Integer num_r = reverseInt(num);
			Integer sum = num + num_r;
			int count=1;
			while (is_palindrome(sum) == false) {
				sum = sum + reverseInt(sum);
				count++;
			}
			System.out.println(count+" "+sum);
		}
	}

}
*/
