package test;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("첫번째 수 입력: ");
		a = sc.nextInt();
		System.out.println("두번째 수 입력");
		b = sc.nextInt();

		if(a>b)
		{
			System.out.println("max: " + a);
		}
		else {
			System.out.println("max: " + b);
		}
	}

		
}
