package test;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("ù��° �� �Է�: ");
		a = sc.nextInt();
		System.out.println("�ι�° �� �Է�");
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
