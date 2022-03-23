package label;

//외형변경 인터페이스
public interface Changable  extends Resizable, Colorable{
	//크기를 변경한다.
	//전경색을 변경한다.
	//배경색을 변경한다.
	void setFont(String font); //폰트를 변경한다
}
