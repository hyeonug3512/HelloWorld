package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 95;
			
		// 60점을 넘으면 pass 아니면 fail
		// 90점을 넘으면 양호, 70점을 넘으면 보통, 아니면 미흡.
		if(var1 > 90) {
			if(var1 >=95)
				System.out.println("A+");
			else
				System.out.println("A0");
		}else if (var1>80) {
			if(var1 >=85)
				System.out.println("B+");
			else
				System.out.println("B0");
		}else if (var1>70) {
			if(var1 >=75)
				System.out.println("C+");
			else
				System.out.println("C0");
		}else if (var1>60) {
			if(var1 >=65)
				System.out.println("D+");
			else
				System.out.println("D0");
		}else
			System.out.println("F");
	}

}
