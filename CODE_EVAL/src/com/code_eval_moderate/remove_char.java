package com.code_eval_moderate;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*IN
how are you, abc
hello world, def
 */
/*OUT
how re you
hllo worl
 */

// 5/11/16
public class remove_char {
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()){
				String line = in.nextLine();
				line = line.trim();
				String[] str = line.split(",");
				String pat = str[1].trim();
				char[] ca = str[0].trim().toCharArray();
				List<Character> lc = new ArrayList<Character>();
				for (int i=0; i<ca.length; i++){
					// check if char is in pat to be removed
					boolean remove = false;
					for (int j=0; j<pat.length(); j++){
						if (ca[i] == pat.charAt(j)) {
							remove = true;
							break;
						}
					}
					if (remove == false) {
						lc.add(ca[i]);
					}
				}
				for (int i=0; i<lc.size(); i++)	{
					if (i == lc.size()-1)
						System.out.printf("%c%n",lc.get(i));
					else
						System.out.printf("%c",lc.get(i));
				}
				
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
public class remove_char {
	
	public static boolean removechar(char ch, char[] pat) {
		for (int i=0; i < pat.length; i++ ) {
			if (ch == pat[i]) return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line=br.readLine()) != null) {
			line = line.trim();
			String[] str = line.split(",");
			char[] pattern = str[1].trim().toCharArray();
			char[] source=str[0].trim().toCharArray();
			List<Character> ll_dest = new ArrayList<Character>();
			for (int i=0; i < source.length; i++){
				if (removechar(source[i], pattern) == false) 
					ll_dest.add(source[i]);
			}
			for (int i=0; i < ll_dest.size(); i++) {
				System.out.printf("%c",ll_dest.get(i));
			}
			System.out.printf("%n");
		}

	}

}
*/