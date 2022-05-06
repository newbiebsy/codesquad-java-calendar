package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(num1 + num2);
		
		sc.close();
	}
}
