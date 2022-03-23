//누적계산 클래스
class Accumulator {
	int total;
	static int grandTotal;
	
//	Accumulator(){
//	}
//	
	void accumulate(int no) {
		//sum += no;
		//total = total + no;
		total += no;
		grandTotal += no;
	}
	
	static int getGrandTotal() {
		return grandTotal /* + total */ ; 
		//객체소유의 필드(인스턴스멤버) 에는 접근 불가
		//객체소유의 메소드에도 접근 불가
	}
	
}
