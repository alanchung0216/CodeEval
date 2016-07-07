package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class set_intersection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		// we may use InputStreamReader if data is coming from console
        //InputStreamReader inputReader = new InputStreamReader(System.in,"utf-8");
		//BufferedReader buffReader = new BufferedReader(inputReader);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String $int;
		public final static int w();
		double hyperbolicCosine(){};
		 byte b = 5;
		 short s = 55; 
		b = s;
		
		byte b = 2; 
		byte b1 = 3; 
		b = b * b1;
		
		while ((line=br.readLine()) != null){
			String[] str = line.trim().split(";");
			String[] str_1 = str[0].trim().split(",");
			String[] str_2 = str[1].trim().split(",");
			int[] num_1 = new int[str_1.length];
			int[] num_2 = new int[str_2.length];
			for (int i=0; i<str_1.length; i++){
				num_1[i] = Integer.valueOf(str_1[i]);
				//System.out.println(num_1[i]);
			}
			for (int i=0; i<str_2.length; i++){
				num_2[i] = Integer.valueOf(str_2[i]);
				//System.out.println(num_2[i]);
			}
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for (int i=0; i< num_1.length; i++){
				for (int j=0; j< num_2.length; j++) {
					if (num_2[j] == num_1[i]) {
						if (hm.get(num_2[j]) == null){
							hm.put(num_2[j], 1);
							//System.out.println("put "+num_2[j]);
						}
					}
				}
			}
			Set<Integer> es = hm.keySet();
			List<Integer> ll = new ArrayList<Integer>(es);
			Collections.sort(ll);
			if (ll.size() == 0)
				System.out.println();
			else
				for (int i=0; i<ll.size(); i++){
					System.out.printf("%d",ll.get(i));
					if (i == ll.size()-1)
						System.out.printf("%n");
					else
						System.out.printf(",");
				}
			
		}
		br.close();
	}

}
