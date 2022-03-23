
import java.util.Calendar;

public class CalendarMain {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		cal.set(2021, 10, 1); // 1일로 세팅

		int end = cal.getActualMaximum(Calendar.DATE);
		// 해당 월 마지막 날짜
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		// 해당 날짜의 요일(1:일요일 … 7:토요일)

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print(" ");
				}
				if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
					System.out.print(" ");
				}
				System.out.print(" "+i+" ");
				if(dayOfWeek%7==0) {//한줄에 7일씩 출력
					System.out.println();
				}
				dayOfWeek++;
				
			}
		}

	}
}
