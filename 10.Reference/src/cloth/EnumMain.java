package cloth;

import color.Color;

public class EnumMain {
	public static void main(String[] args) {
		System.out.println(Season.SPRING.value());
		System.out.println(Season.SUMMER.value());
		System.out.println(Season.FALL.value());
		System.out.println(Season.WINTER.value());
		System.out.println("---------------------");
		
		System.out.println( Color.BLUE.value() );
		System.out.println( Color.YELLOW.value() );
		System.out.println( Color.RED.value() );
		System.out.println( Color.GREEN.value() );
	}
}
