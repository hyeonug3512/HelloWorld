package classes.extendpkg;

import java.util.Calendar;

public class CalendarExe {
		public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
			cal.set(2019, 0, 1);
			System.out.println("�⵵: " +cal.get(Calendar.YEAR));
			System.out.println("��: " +cal.get(Calendar.MONTH));
			System.out.println("��: " +cal.get(Calendar.DAY_OF_MONTH));
			System.out.println("������ ��: " +cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println("������ ����: " +cal.get(Calendar.DAY_OF_WEEK));
			cal.set(2019, 0, 1);
		
			createCal(2020, 2);
		}
		
		public static void createCal(int year, int month) {
			
		}
		
}
