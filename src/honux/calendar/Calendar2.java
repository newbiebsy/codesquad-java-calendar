package honux.calendar;

public class Calendar2 {
	/*
	 * 월을 입력하면 해당월의 달력을 출력한다.
	 * 달력은 모양은 1단계에서 작성한 모양으로 만든다.
	 * 1일은 일요일로 정해도 무방하다.
	 * -1을 입력받기 전까지 반복 입력받는다.
	 * 프롬프트를 출력한다.
	 */

	public void prtCal(int year,int month) {
		Calendar cal = new Calendar();
		
		int[][] maxday = new int [5][7] ;
		int day = 1;
		boolean flag = false;
		
		System.out.println("<<    "+year+"년   "+month+"월>>");
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		for (int i = 0; i < maxday.length; i++) {
			for (int j = 0; j < maxday[i].length; j++) {
				maxday[i][j] = day++;
				System.out.printf("%3d",maxday[i][j]);
				if(day == cal.getMaxDaysOfMonth(year,month)+1) {
					flag = true;
					break;
				}
			}
			System.out.println();
			if(flag == true) {
				break;
			}
		}
		
		
		
	}
	
}
