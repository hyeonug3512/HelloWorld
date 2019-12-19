package conditions;

public class SwitchExample {
	public static void main(String[] args) {

		int num = (int)(Math.random()*6) +1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
		    System.out.println("6번이 나왔습니다.");
			break;
			
		
		
		
//		int score = 83;
//		switch (score/10) {
//		
//	    case 9:
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A");
//			break;	    
//		case 8: 
//				System.out.println("점수가 80보다 큽니다.");
//				System.out.println("등급은 B");
//			break;
//		case 7: 
//					System.out.println("점수가 70보다 큽니다.");
//					System.out.println("등급은 C");
//			break;
//		default:	System.out.println("점수가 70보다 작습니다.");
//					System.out.println("등급은  D");
		}
	}
}
				
			
	


