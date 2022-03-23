package ex_poly.worker;

public class DailyWorker extends Worker{
//	정규직 직원                  비정규직 직원                 일용직 직원
//	사번						사번 					사번 
//	성명						성명 					성명 
//	급여(연봉)				급여(연봉)				급여(일당)
//	근로형태					근로형태					근로형태	
//	보너스		                 계약기간					근무일수
//	월급여를 계산한다		월급여를 계산한다.		월급여를 계산한다
	int workDays;
	
	DailyWorker(String empNo, String name
					, String workType, int pay ){
		super(empNo, name, workType, pay);
	}
	//근무일수를 변경한다
	void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	
	int getMonthPay() {
		return  pay * workDays;
	}
}
