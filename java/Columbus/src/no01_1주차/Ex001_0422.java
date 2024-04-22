package no01_1주차;

import java.util.Scanner;

public class Ex001_0422 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/11720
		
		// N <=100 . 최대 100자 (double이 16자리까지 가능) => String으로 받

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String input = sc.next();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += Character.getNumericValue(input.charAt(i));
		}
		
		System.out.print(sum);

		sc.close();
	}

}
