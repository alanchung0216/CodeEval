package com.code_eval_easy;

import java.io.File;
import java.io.IOException;

public class file_size {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		int len = (int) file.length();
		System.out.println(len);
	}

}
