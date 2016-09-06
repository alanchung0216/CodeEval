package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// implement a stack with push and pop
/*IN
1 2 3 4
10 -2 3 4
 */
/*Print to stdout every alternate space delimited integer, one per line.
4 2
4 -2
 */
public class stack_implement {
	public static void push(List<Integer> ll, Integer i){
		ll.add(i);
	}
	public static Integer pop(List<Integer> ll) {
		return ll.remove(ll.size()-1);
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] str = line.trim().split(" ");
			Integer[] itr = new Integer[str.length];
			List<Integer> ll = new ArrayList<Integer>();
			for (int i=0; i<str.length; i++){
				itr[i]=Integer.valueOf(str[i]);
				push(ll, itr[i]);
			}
			int count=ll.size();
			for (int i=0; i< count; i++){
				int value=pop(ll);
				if ((i%2 == 0) && (i==count-1)) {
					System.out.printf("%d%n",value);
				} else if (i%2 == 0) {
					System.out.printf("%d",value);
				} else if ((i%2 == 1) && (i==count-1)) {
					System.out.printf("%n");
				}else {
					System.out.printf(" ");
				}
			}
		}
		in.close();
	}

}
