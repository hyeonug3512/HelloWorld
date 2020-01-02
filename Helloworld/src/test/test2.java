package test;

public class test2 {
	public static void main(String[] args) {
	String name = "±èÃ¶¼ö";
	int[] value = {90,70,75};
	
	int sum = 0;
	float avg = 0f;
	
	for(int i = 0; i<value.length; i++ ) {
		sum += value[i];
	}
	double avg1 = (double)sum/value.length;
 System.out.println("ÀÌ¸§: " + name);
	System.out.println("ÇÕ°è : " + sum);
	System.out.println("Æò±Õ : " +Math.round((avg1) *10) / 10.0);
		
}
}