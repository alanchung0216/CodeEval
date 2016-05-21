package com.code_eval_moderate;

public class endianness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] in = new byte[4];
		in[0] = 1;
		int num = (int) in[0];
		if (num == 1)
			System.out.println("BigEndian");
		else
			System.out.println("LittleEndian");
	}

}
