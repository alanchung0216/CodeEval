package com.code_eval_easy;

// 5/10/16
public class prime_palindrome {
	public static void main(String[] args){
		// find largest prime palindrome less than 1000
		
		int max_pal=0;
		for (int i=0; i<1000; i++) {
			// is this prime?
			boolean prime = true;
			for (int j=2; j < i; j++){
				if (i % j == 0) {
					prime = false;
					break;
				}					
			}
			if (prime){
				// is this palindrome
				String str = Integer.toString(i);
				char[] ca = str.toCharArray();
				boolean pal = true;
				for (int k=0; k < ca.length/2; k++){
					if (ca[k] != ca[ca.length-1-k]){
						pal = false;
						break;
					}
				}
				if (pal){
					// is this biggest
					if (i > max_pal) {
						max_pal =i;
					}					
				}
			}
		}
		System.out.println(max_pal);
	}
}


// 4/22/16
/* similar but a little bulky. no need to crete a interger array.

public class prime_palindrome {

	public static void main(String[] args) {
		// find largest prime palindrome number less than 1000
		// create an integer array
		//int n = Integer.parseInt(args[0]);
		int n=1000;
		int[] arr= new int[n-1];
		for (int i=0; i< arr.length; i++){
			arr[i] = i+1;
		}
		int max_prime=0;
		// find out if this is a prime
		
		for (int i=0; i<arr.length; i++){
			boolean prime = true;
			int prime_num=arr[i];
			for (int j=0; j<arr[i]; j++){
				if ((arr[j] == 1) || (arr[j] == arr[i])) continue;
				if ((arr[i] % arr[j]) == 0) {
					prime=false; // dividable by arr[j]
					break;
				}
			}
			if (prime == true) {
				// find out if this is palindrome
				String str = String.valueOf(prime_num);
				//char[] ca = str.toCharArray(); // this way is better
				char[] ca = new char[str.length()];
				for (int k=0; k<ca.length; k++){
					ca[k]=str.charAt(k);
				}
				boolean palindrome=true;
				for (int k=0; k<ca.length/2; k++){
					if (ca[k] != ca[ca.length-k-1]){
						palindrome=false;
						break; // it's not palindrome
					}
				}
				if (palindrome) {				
					// find out if this is biggest so far
					if (prime_num > max_prime) max_prime = prime_num;
				}
			}
		}
		System.out.println(max_prime);
		
	}

}

*/
