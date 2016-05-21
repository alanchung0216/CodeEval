package com.code_eval_easy;

/*
 * A prime number is a positive integer which has no factors other than 1 and itself. 
 * 1 itself, by definition, is not a prime number. The first few prime numbers are 
 * 2, 3, 5, 7, 11, 13, ... and can't be divided further.
 * */

// 5/10/16

public class sum_prime {
	public static void main(String[] args){
		int prime_sum=0;
		int count=1000;
		int i=2; // 2, 3, 5, 7, are prime,
		while (count != 0){
			// is this prime
			boolean prime = true;
			for (int j=2; j<i; j++){
				if (i % j == 0){
					prime=false;
					break;
				}
			}
			if (prime){
				prime_sum += i;
				count--;
			}
			i++;
		}
		System.out.println(prime_sum);
	}
}

// 4/21/16

/*

public class sum_prime {

	public static void main(String[] args) {
		
		int max_prime=0;
		int prime_count=1000;
		int n = 2;
		while (prime_count != 0) {
			boolean prime_flag=true;
			for (int i=2; i<n; i++) {
				
				if (n % i == 0 ) {
					//if ((i==1) || (i==n)) continue;
					prime_flag=false;
					//System.out.println("not prime "+n);
					break;
				}
			}
			if (prime_flag == true) {
				max_prime += n;
				//System.out.println(n);
				prime_count--;
			}
			n++;
		}
		System.out.println(max_prime);

	}

}
*/
