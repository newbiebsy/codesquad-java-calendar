package honux.calendar;

import java.util.Scanner;

public class Prompt {

	/**
	 * 
	 * @param week 요일명
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;
	}
	
	// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
//		Calendar2 cal2 = new Calendar2();

		int month = 1;
		int year = 2022;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요(exit : -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			
			if(year == -1) {
				break;
			}
			
			System.out.println("달을 입력하세요. ");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요(su, mo, tu, we, th,fr,sa)");
			sc.nextLine();
			String str_weekday = sc.nextLine();
			weekday = parseDay(str_weekday);
			
			if (month > 12 || month <= 0) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			cal.printCalendar(year, month, weekday);
			System.out.println();
//			cal2.prtCal(year, month);
		}

		System.out.println("bye~!");
		sc.close();
	}

	public static void main(String[] args) {

		// 셸 실행
		Prompt pr = new Prompt();
		pr.runPrompt();
		
	}
}
