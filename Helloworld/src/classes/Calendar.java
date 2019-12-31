package classes;

public class Calendar {

	public static Object YEAR;


	public static void main(String[] args) {
		// 해당월의 날짜수, 월의 첫날(1일)의 시작요일
		int month = 11;
//		System.out.println(getFirstDayofMonth(month));
//		System.out.println(getMaxDate(month));
		String[] weeks = {"Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};
		for(int i =0; i<weeks.length; i++) {
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("=========================================");
		//7일 단위로 출력.
		int spaceCnt=0;
		for(int i = 1; i<getFirstDayofMonth(month); i++) {
			System.out.println("   ");
			spaceCnt++;
		}
		
		for(int i = 1; i <=getMaxDate(month); i++) {
			System.out.printf("%4d", i);
			if ((i + spaceCnt) % 7 == 0)
				System.out.println();
		}
	}

		
	public static int getFirstDayofMonth(int month) {
		int result = 0;
		if(month==9) {
			result =1;
		}else if(month==10) {
			result =3;
		}else if(month==11) {
			result =6 ;
		}else if(month==12) {
			result =2 ;
		}
		return result;
	}

	// 해당월의 날짜수.
	public static int getMaxDate(int month) {
		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {
				dayCnt = 31;
			} else if (month == 2) {
				dayCnt = 28;
			} else {
				dayCnt = 30;
			}
		} else {
			if (month % 2 == 0) {
				dayCnt = 31;
			} else {
				dayCnt = 30;
			}
		}
		return dayCnt;
	}


	public static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}


	public char[] get(Object yEAR2) {
		// TODO Auto-generated method stub
		return null;
	}
}
