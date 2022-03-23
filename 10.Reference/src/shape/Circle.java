package shape;

public class Circle implements Cloneable{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	
	public boolean equals( Object obj ) {
//		//두 객체가 Circle 객체이어야 데이터가 같은지 비교가능
		if( obj instanceof Circle ) {
			Circle c = (Circle)obj;
			if( radius == c.radius ) 
				return true;
			else					 
				return false;
		}else		
			return false;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}
