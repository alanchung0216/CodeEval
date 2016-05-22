package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class decimal_binary {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()){
			String line = in.nextLine();
			String[] str = line.split(" ");
			if (str.length == 0) continue;
			int num = Integer.valueOf(str[0]);
			//System.out.printf("%d ",num);
			List<Integer> ll = new ArrayList<Integer>();
			if (num == 0) ll.add(0);
			while (num != 0){
				int b = num % 2;
				num = num / 2;
				ll.add(b);
			}
			for (int i=ll.size()-1; i >= 0; i--){
				System.out.printf("%1d",ll.get(i));
				if (i == 0 ) System.out.println();
			}
			
		}
		in.close();
	}

}
