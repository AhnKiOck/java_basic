package geometry;

//삼각형: 점 3개를 연결
//사각형: 점 4개를 연결
//오각형: 점 5개를 연결..
//점의 갯수에 따라 다각형이 결정된다
//정사각형은 점 한개의 위치, 한 변의 길이를 알면 된다

public class Polygon {
	protected int x[], y[];
	
	protected Polygon(int no){
		//점의 갯수에 따라 배열의 갯수를 정한다
		x = new int[no];
		y = new int[no];
	}
	
	protected void setPoint(int x, int y, int index) {
		this.x[index] = x;
		this.y[index] = y;
	}
}
