package date;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class CalendarMain02 {
	public static void main(String[] args) {
		GregorianCalendar 
				g1 = new GregorianCalendar(2021, 11, 1);
		GregorianCalendar 
				g2 = new GregorianCalendar(2021, 11, 1);
		
		GregorianCalendar g3 
				= (GregorianCalendar)g2.clone();
		
		SimpleDateFormat sdf 
				= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( "g2: " + sdf.format(g2.getTime()) );
		System.out.println( "g3: " + sdf.format(g3.getTime()) );
		
		
		
		
		
		System.out.println("------------------");
		System.out.println( g1 );
		System.out.println( g2 );
		if( g1 == g2 )
			System.out.println( "같음");
		else
			System.out.println( "다름");
		
		if( g1.equals(g2) )
			System.out.println( "같은 날짜");
		else
			System.out.println( "다른 날짜");
	}
}
