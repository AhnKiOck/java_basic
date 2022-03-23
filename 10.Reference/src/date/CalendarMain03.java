package date;

import java.util.Calendar;

public class CalendarMain03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2020, 11, 1); // 2021 /12 /1
		
		//달력형태 출력
		//요일  일1, 월2 화3 수4 목5 금6 토7
		int startDay = c.get(Calendar.DAY_OF_WEEK);
		//startDay: 4
		int end = c.getActualMaximum(Calendar.DATE); //31
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for( int i=1; i<startDay; i++ ) {
			System.out.print("\t");
		}
		//일1, 월2 화3 수4 목5 금6 토7
		//                    1
		//           1  2  3  4
		//(시작요일-1) + 오늘날짜=7
		for(int no=1; no<=end; no++) {
			System.out.print(no);
			System.out.print( 
				(startDay-1 + no)%7==0 ? "\n" :  "\t"  );
		}
		
		
		
		
		
		
	}
}
