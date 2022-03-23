
public class AccumulatorMain03 {
	public static void main(String[] args) {
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계: " + grandTotal);
		
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		acc1.accumulate( 10 );
		acc2.accumulate( 20 );
		
		grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계: " + grandTotal);
		System.out.println("acc1 total: " + acc1.total);
		System.out.println("acc2 total: " + acc2.total);
	}
}




