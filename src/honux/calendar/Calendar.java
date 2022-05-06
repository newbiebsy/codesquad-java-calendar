package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int month) {
		// if문 사용보다 아래 사용이 더 좋다
		return MAX_DAYS[month-1];
		
//		if(month == 1 || month == 3 || month == 5 
//				|| month == 7 || month == 8 || month == 10
//														|| month == 12 ) {
//			return 31;
//		}else if(month == 2) {
//			return 28;
//		}else {
//			return 30;
//		}
	}
	
	public void printSampleCalendar() {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
				
		Calendar cal = new Calendar();
		
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		
		System.out.println(month+"월은 "+cal.getMaxDaysOfMonth(month)+"일까지 있습니다");
		
	
		
	}
}
