package shape;

public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		
		Circle c3 = (Circle)c2.clone();
		
		if( c2.equals( c3 ) )
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
		
		
		if( c1==c2 )
			System.out.println("같은 인스턴스");
		else
			System.out.println("다른 인스턴스");
		
		if( c1.equals( c2 ) )
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
		
	}
}
