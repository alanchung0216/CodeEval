package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Write a program to determine the lowest common ancestor of two nodes in a 
binary search tree. You may hardcode the following binary search tree in 
your program: int[] inp = {30, 8, 52, 3, 20, 10, 29}; I used recursive
to read the input and create the BST.
    30
    |
  ____
  |   |
  8   52
  |
____
|   |
3  20
    |
   ____
  |   |
  10 29
*/
//
/*INPUT These values represent two nodes within the tree, one per line. 
8 52
3 29
 */
/*Print to stdout the lowest common ancestor, one per line. Lowest means 
 * the lowest depth in the tree, not the lowest value. E.g.:

30
8
 */
class TNODE {
	int value;
	TNODE left;
	TNODE right;
	
	public TNODE(int i){
		value = i;
	}
	public void put(int i){
		if (i < value) {
			if (left != null) {
				left.put(i);
			} else {
				left = new TNODE(i);
			}
		} else if (i > value){
			if (right != null){
				right.put(i);
			} else {
				right = new TNODE(i);
			}
		} else {
			value = i;
		}
	}
	public int get(int i){
		if (i < value){
			return left == null ? null : left.get(i);
		} else if (i > value){
			return right == null ? null : right.get(i);
		} else {
			return value;
		}
	}
}

class BSTREE {
	TNODE root;
	public void put(int i){
		if (root == null) {
			root = new TNODE(i);
		} else {
			root.put(i);
		}
	}
	public int get(int i){
		return (root == null) ? null : root.get(i);
	}
}
/*read 
http://www.moreofless.co.uk/binary-search-tree-bst-java/
	for how to create binary search tree. using key/value pair
	
*/
//Tree LOWEST COMMON ANCESTOR
public class tree_l_c_a {
	// input - 3, 8, 10, 20, 29, 30, 52
	// read the input and create the BST

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//String s = "30 8 52 3 20 10 29";
				//3 8 10 20 29 30 52";
		//String[] in = s.trim().split(" ");
		int[] inp = {30, 8, 52, 3, 20, 10, 29};
		BSTREE bst = new BSTREE();
	
		for (int i=0; i<inp.length; i++){
			bst.put(inp[i]);
		}
//		for (int i=0; i<inp.length; i++){
//			System.out.println(bst.get(inp[i]));
//		}
		File file = new File(args[0]);
		
		Scanner in = new Scanner(file);
		while (in.hasNext()) {
			int int1 = in.nextInt();
			int int2 = in.nextInt();
			in.nextLine();
			System.out.println(find_l_c_a(bst.root,int1,int2));
		}	
		in.close();			

	}
	
	public static int find_l_c_a(TNODE root, int int1, int int2){
		int low=0;
		int high=0;
		if (int1 < int2) {
			low = int1;
			high = int2;
		} else{
			low = int2;
			high= int1;
		}
        // We have found one of the nodes. The other is below, so we're done.
        if (low == root.value) {
            return root.value;
        }
        if (high == root.value) {
            return root.value;
        }		
		if (low < root.value && high > root.value) {
			return root.value;
		} else if (low < root.value && high < root.value){
			if (root.left != null)
				return find_l_c_a(root.left, int1, int2);
			else
				return root.value;
		} else if (low > root.value && high > root.value){
			if (root.right != null)
				return find_l_c_a(root.right, int1, int2);
			else
				return root.value;
		}
		return high;
	}





}
