package date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarMain {
	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH)+1;
		//1월:0 , .... 12월:11
		//1월:January(0)...  12월:December(11)
		int date = gc.get(Calendar.DATE);
		int ampm = gc.get(Calendar.AM_PM); 
		//0:오전, 1:오후
		int hour = gc.get(Calendar.HOUR);
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초 \n"
				, year, month, date
				, (ampm==0 ? "오전" : "오후")
				, hour, minute, second);
		
		//현재 시스템의 타임존 아이디 확인
		System.out.println("디폴트 타임존  ID: "
					+ TimeZone.getDefault().getID());
		//사용가능한 타임존 확인
//		for( String zone : TimeZone.getAvailableIDs() ) {
//			System.out.println( zone );
//		}
		System.out.println("-----------");
		
		//런던 시간대로 시간을 지정해서 현재 런던 시각을 확인
		//Calendar 는 추상클래스이나 객체의 형태를 제공한다
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone( TimeZone.getTimeZone("Europe/London")  );
		
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		//1월:0 , .... 12월:11
		//1월:January(0)...  12월:December(11)
		date = calendar.get(Calendar.DATE);
		ampm = calendar.get(Calendar.AM_PM); 
		//0:오전, 1:오후
		hour = calendar.get(Calendar.HOUR);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초 \n"
				, year, month, date
				, (ampm==0 ? "오전" : "오후")
				, hour, minute, second);
		System.out.println("----------------");
		
		//시스템 날짜가 아닌 특정 날짜의 객체가 필요하다면 
		//생성자 파라미터로 날짜를 지정할 수 있다.
		gc = new GregorianCalendar(2021, 9, 5);
		year = gc.get(Calendar.YEAR);
		month = gc.get(Calendar.MONTH)+1;
		date = gc.get(Calendar.DATE);
		int day = gc.get(Calendar.DAY_OF_WEEK);
		//일1, 월 화 수 목 금 토 7
		System.out.printf("%d년 %d월 %d일 %s \n"
						, year, month, date
						, dayOfWeek(day));
	}
	static String dayOfWeek(int digitDay) {
		String day;
		switch( digitDay ) {
		case 1:	
			day = "일";	break;
		case 2:	
			day = "월";	break;
		case 3:	
			day = "화";	break;
		case 4:	
			day = "수";	break;
		case 5:	
			day = "목";	break;
		case 6:
			day = "금"; break;
		default:
			day = "토"; break;
		}
		return day;
	}
	
	
	
	
}
