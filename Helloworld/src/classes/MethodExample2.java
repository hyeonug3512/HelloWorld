package classes;

public class MethodExample2 {
	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("결과는" + result);
		
		int[] intAry = {2,3,4,5,6,7};
		int sum = sum(intAry);
		int[] intAry2 = {3,4,5};
		sum = 0;
		sum = sum(intAry2);
		System.out.println("합계는" + sum);
		
		printString(5, "A");
	}
	
	private static void printString(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	public static double sum(double a, double b) {
		return a+ b;
	}

	public static int sum(int[] iary) {
		int sum = 0;
		for(int i=0; i<iary.length; i++) {
			sum= sum + iary[i];
			
		}
		public static void printString(int x, String str) {
			
			for(int i =1; i <=x; i++) {
				for(int j = 1; j<=1; j++) {
					System.out.println(str);
				}
				System.out.println();
			}
		}
	}
	
}
