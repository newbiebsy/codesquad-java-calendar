package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		Calendar2 cal2 = new Calendar2();

		int month = 0;
		int year = 0;

		while (true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			System.out.println("달을 입력하세요. ");
			System.out.print("MONTH> ");
			month = sc.nextInt();

			if (month == -1) {
				break;
			}
			if (month > 12 || month <= 0) {
				continue;
			}
			cal.printCalendar(year, month);
			cal2.prtCal(year, month);
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
