package ex_poly.worker;

public class TemporaryWorker extends Worker{
//	정규직 직원                  비정규직 직원                 일용직 직원
//	사번						사번 					사번 
//	성명						성명 					성명 
//	급여(연봉)				급여(연봉)				급여(일당)
//	근로형태					근로형태					근로형태	
//	보너스		                 계약기간					근무일수
//	월급여를 계산한다		월급여를 계산한다.		월급여를 계산한다
	int period;
	
	TemporaryWorker(String empNo, String name
						, String workType, int pay, int period){
		super(empNo, name, workType, pay);
		this.period = period;
	}
//	abstract int getMonthPay();
	int getMonthPay() {
		//비정규직: 연봉 / 12
		return pay / 12;
	}
}
