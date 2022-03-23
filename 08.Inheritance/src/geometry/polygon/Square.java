package geometry.polygon;

import geometry.Polygon;

public class Square extends Polygon{
	Square(int x, int y, int sideLength){
		super(4);
		//점 4개의 좌표를 지정한다
		setPoint(x, y, 0);
		setPoint(x+sideLength, y, 1);
		setPoint(x+sideLength, y+sideLength, 2);
		setPoint(x, y+sideLength, 3);
	}
	
//	protected int x[], y[];
	int getX(int index) {
		return x[index];
	}
	int getY(int index) {
		return y[index];
	}
}
