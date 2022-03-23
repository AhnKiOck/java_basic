package shape;

public class Rectangle {
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if( obj  instanceof Rectangle ) {
			Rectangle r = (Rectangle)obj;
			
			if( width == r.width && height==r.height )
				return true;
			else if(width==r.height && height==r.width )
				return true;
			else
				return false;
			/*
			if( width == r.width && height==r.height )
				return true;
			else 
				return false;
			*/
		}
		return false;
	}
	
}
