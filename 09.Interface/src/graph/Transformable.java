package graph;

//	변환 인터페이스
public interface Transformable  extends Movable{
	void resize(int width, int height); //  크기를 변경한다.
//	절대좌표로 이동한다							
//	상대위치만큼 좌표를 이동한다
}
