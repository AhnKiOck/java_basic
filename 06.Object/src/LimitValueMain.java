
public class LimitValueMain {
	public static void main(String[] args) {
		System.out.println("상한값: " + LimitValue.UPPER_LIMIT);
		
		LimitValue lv = new LimitValue();
		lv.setValue( 90000 );
		System.out.println( "lv.value: " + lv.value );
		
		lv.setValue( 150000 );
		System.out.println( "lv.value: " + lv.value );
	}
}
