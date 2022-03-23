package shape;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CircleMain02 {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Class cls = c.getClass(); //Circle 객체의 모든 정보가 있다
		
		System.out.println( "클래스명: "+ cls.getName() );
		
		Class superCls = cls.getSuperclass();
		System.out.println( "수퍼클래스명: "+ superCls.getName() );
		
		Field field[] = cls.getDeclaredFields();
		System.out.print("필드명: ");
		for(Field f : field ) {
			System.out.println( f + " ");
		}
		
		Method[] method = cls.getDeclaredMethods();
		System.out.println("메소드명: ");
		for( Method m : method ) {
			System.out.println( m );
		}
	}
}
