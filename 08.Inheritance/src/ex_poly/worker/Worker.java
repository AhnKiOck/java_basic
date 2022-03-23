package ex_poly.worker;

//	직원
abstract public class Worker {
//	사번, 성명, 급여, 근로형태
	String empNo, name, workType;
	int pay;
	
	Worker(String empNo, String name, String workType, int pay){
		this.empNo = empNo;
		this.name = name;
		this.workType = workType;
		this.pay = pay;
	}
//	월급여를 계산한다
	//정규직: 연봉+보너스% / 12
	//비정규직: 연봉 / 12
	//일용직: 일당 * 근무일수
	abstract int getMonthPay();
}
