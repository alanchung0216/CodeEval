package com.code_eval_moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class longest_lines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line=br.readLine();
		int num = Integer.valueOf(line);
		List<String> ll = new ArrayList<String>();
		String first = br.readLine();
		ll.add(first);		
		while ((line=br.readLine()) != null) {
			line = line.trim();
			for (int i=0; i<ll.size(); i++){
				if (line.length() > ll.get(i).length()){
					ll.add(i, line);
					break;
				}
				if (line.length() <= ll.get(ll.size()-1).length()){
					ll.add(line);
					break;
				}
			}		
		}
		for (int j=0; j<num; j++){
			System.out.println(ll.get(j));
		}
		br.close();
	}

}
