package com.code_eval_easy;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<13; i++){
			for (int j=1; j<13; j++){
				int value = i * j;
				if (j==12)
					//System.out.printf("%-4d%n",value); // left justify
					System.out.printf("%4d%n",value); // right justify
				else
					System.out.printf("%4d",value);
			}
		}

	}

}
