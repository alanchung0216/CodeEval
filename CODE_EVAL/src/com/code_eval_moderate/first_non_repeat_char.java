package com.code_eval_moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class first_non_repeat_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			char[] ca = line.trim().toCharArray();
			// not synchronized, fast, not thread safe, allow null key
			HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
			// synchronized, slow, thread safe
			//Hashtable<Character,Integer> hm = new Hashtable<Character, Integer>();
			for (int i=0; i < ca.length; i++) {
				if (hm.containsKey(ca[i])){
					int value = (int) hm.get(ca[i]);
					hm.put(ca[i],++value);
					//hm.put(null,null); // allow in hashmap
					//hm.put(null,5); // allow in hashmap
				} else	
					hm.put(ca[i], 1);
			}
			// print the first non repeated char
			for (int i=0; i < ca.length; i++) {
				if (hm.get(ca[i]) == 1){
					System.out.println(ca[i]);
					break;
				}
			}
			/*
			// print hm value
			// Get a set of the entries 
			Set set = hm.entrySet(); 
			// Get an iterator 
			Iterator itr = set.iterator(); 
			// Display elements 
			while(itr.hasNext()) { 
				Map.Entry me = (Map.Entry)itr.next(); 
				System.out.print(me.getKey() + ": "); 
				System.out.println(me.getValue()); 
			}
			System.out.println();
			 */
		}
		br.close();
	}

}
