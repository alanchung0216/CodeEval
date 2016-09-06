package com.code_eval_moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*The integer represents an index in the list (1-based), one per line.
a b c d 4
e f g h 2
 */
/*Print to stdout the Mth element from the end of the list, 
 * one per line. If the index is larger than the number of 
 * elements in the list, ignore that input.
a
g
 */
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
