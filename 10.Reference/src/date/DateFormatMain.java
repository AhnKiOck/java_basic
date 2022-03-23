package date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatMain {
	public static void main(String[] args) {
		//시스템날짜, 시각을 알수 있는 객체
		GregorianCalendar gc = new GregorianCalendar();
		Date now = gc.getTime(); //년월일시분초
		System.out.println( gc.getTime() );
		System.out.println( now );
		
		Date date = new Date();
		date.getTime();
		
		//Date 타입인 날짜정보를 2021년 월 일.. 의 형태로 보여지게 
		//날짜 타입을 문자열로 만들어주는 기능을 가진 클래스
		SimpleDateFormat sdf
		= new SimpleDateFormat("yyyy년 MM월 dd일 E a HH시 mm분 ss초");
		System.out.println( sdf.format( now ) );
		
		sdf
		= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println( sdf.format( now ) );
		
	}
}






