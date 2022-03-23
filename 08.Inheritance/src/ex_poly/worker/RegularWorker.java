package ex_poly.worker;

public class RegularWorker extends Worker{
//	정규직 직원                  비정규직 직원                 일용직 직원
//	사번						사번 					사번 
//	성명						성명 					성명 
//	급여(연봉)				급여(연봉)				급여(일당)
//	근로형태					근로형태					근로형태	
//	보너스		                 계약기간					근무일수
//	월급여를 계산한다		월급여를 계산한다.		월급여를 계산한다
	//연봉제로 연봉 2천만원 + 보너스 10% 계약
	int bonus;  // 연봉의 15%, 10% 
	
	RegularWorker(String empNo, String name
						, String workType, int pay, int bonus){
		super(empNo, name, workType, pay);
		this.bonus = bonus;
	}
	
//	abstract int getMonthPay();
	int getMonthPay() {
		//정규직: 연봉+보너스% / 12
		//       연봉 + 연봉*보너스요율 : 연봉 * (1+보너스요율)
		double monthly = pay * (1 + bonus*0.01) / 12;
		int month = (int)monthly;
		return (int)monthly;
//		return month;
//		return (int)(pay * (1 + bonus*0.01) / 12);
	}
	
	
	
	
	
	
}
