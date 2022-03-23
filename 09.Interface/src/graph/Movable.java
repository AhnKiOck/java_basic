package graph;

//	위치 이동 인터페이스						
public interface Movable {
	void moveTo(int x, int y); //	절대좌표로 이동한다						
	void moveBy(int x, int y); //	상대위치만큼 좌표를 이동한다				
}
