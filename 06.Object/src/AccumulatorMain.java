
public class AccumulatorMain {
	public static void main(String[] args) {
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		acc1.accumulate(10);
		System.out.println("acc1의  total: " + acc1.total);
		System.out.println("acc1의  grandTotal: " + acc1.grandTotal);
		
		acc2.accumulate(20);
		System.out.println("acc2의  total: " + acc2.total);
		System.out.println("acc2의  grandTotal: " + acc2.grandTotal);

		//static 인 grandTotal 필드는 각 객체의 소유가 아니다
		//클래스의 소유: 클래스변수
		//변수: 로컬변수, 인스턴스변수, 클래스변수
		System.out.println("grandTotal: " + Accumulator.grandTotal);
		
	}
}
