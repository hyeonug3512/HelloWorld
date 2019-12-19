package conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int n=1; n<=9; n++) {
			System.out.println("*** " + n + "단 ***");
			for (int m = 1; m <= 9; m++) {
				System.out.print(m + " x " + n + " = " + (m * n)+" ");
			}

		}
     
	
	
	}
}
