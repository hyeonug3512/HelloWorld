package test;

import java.util.Scanner;

class Sample {
	int price;
	String item;
	int qty;

	Sample() {
	}

	Sample(int price) {
		this.price = price;
	}

	Sample(int price, String item) {
		this.price = price;
		this.item = item;
	}
}

public class SampleExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		Sample sample = new Sample(30, "apple");
		samAry[0] = sample;
		
		
		System.out.println("메뉴선택 1. 2. 3.");
		
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택");
		scn.nextLine();
		System.out.println("다음선택");
		scn.nextLine();

		cal("test", 3, 1000);
		
//		Sample sample = null; // new Sample();
//		sample = new Sample(30, "apple");
	}

	static int cal(String a, int b, int c) {

		return 10;
	}

}
