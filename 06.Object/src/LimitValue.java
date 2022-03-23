//상한값 클래스
public class LimitValue {
	int value;
	static final int UPPER_LIMIT = 100000;
	//final static int UPPER_LIMIT = 100000;
	
	void setValue(int value) {
		if( value > UPPER_LIMIT ) {
			this.value = UPPER_LIMIT;
		}else {
			this.value = value;
		}
	}
}
