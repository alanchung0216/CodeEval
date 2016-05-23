package com.code_eval_moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mth_to_last {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) != null){
			//System.out.println(line);
			String[] str = line.trim().split(" ");
			int mth = Integer.valueOf(str[str.length-1]);
			//System.out.println(mth);
			if ( (str.length-1) < mth)  continue;  
			System.out.println(str[(str.length-1)-mth]);
		}
		br.close();
	}

}
