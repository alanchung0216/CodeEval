package com.code_eval_moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_validation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		// regex \w+@\w+(\.\w+)+
		// \w+ means one or more word characters
		// (\.\w+)+ means ("." followed by one or more word characters) grouped one or more
		// \\ is used for \ as required by java compiler.
		String regex = "\\w+@\\w+(\\.\\w+)+";
		Pattern pat = Pattern.compile(regex);
		while ((line = br.readLine()) != null){
			String[] str = line.trim().split(" ");
			if (str.length != 1) {
				System.out.println("false");
				continue;
			}
			if (str[0].equals("")) continue;
			Matcher matcher = pat.matcher(str[0]);
			if (matcher.find())
				System.out.println("true");
			else
				System.out.println("false");				
		}
		br.close();
	}

}
