package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class unique_element {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.trim().split(",");
			int[] ia = new int[str.length];
			for (int i=0; i< str.length; i++){
				ia[i] = Integer.valueOf(str[i]);
			}
			int pre = ia[0];
			for (int i=1; i< ia.length; i++) {
				if (ia[i] == pre) continue;
				System.out.printf("%d,",pre);
				pre=ia[i];
  			}
			System.out.println(pre);
		}
		br.close();
	}

}
