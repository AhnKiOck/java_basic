
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain2 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2021, 11, 1);
		
		int end = gc.getActualMaximum(Calendar.DATE);
		int startDay = gc.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(startDay);
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		//시작요일까지는 탭으로 밀어두기
		for (int i = 1; i <startDay; i++) {
			System.out.print("\t");
		}
		
		//일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		//				   1     2	  3     4    
		//5     6    7     8     10   11    12
		//12    13   
		//startDay(1) + 4 7
		
		
		for (int no = 1; no <= end; no++) {
			// 그 달에 시작하는 요일
			System.out.print(no);
			System.out.println(
					(startDay-1 + no)%7 == 0 ? "\n" : "\t"  );
				// 요일대로 끊어주기 위해서
//				System.out.print( no 
//						+  ( (no + StartWeek) % 7 == 0 ?  "\n" :  "\t") );
		}
		
		/*
		for (int no = 1, k = 1; no <= end; ) {
			// 그 달에 시작하는 요일
			if (k < startDay) {
				System.out.print("\t");
				k++;
			} else {
				System.out.printf("%2s", no);
				// 요일대로 끊어주기 위해서
				System.out.print( ( (no + startDay) % 7 == 0 ?  "\n" :  "\t") );
//				System.out.print( no 
//						+  ( (no + StartWeek) % 7 == 0 ?  "\n" :  "\t") );
				no++;
			}
		}
		*/
	}
}	
