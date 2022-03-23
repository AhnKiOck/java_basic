package ex_poly.worker;
import java.text.DecimalFormat;
//import 선언문 자동완성: ctrl + shift + 영문o

public class WorkerMain {
	public static void main(String[] args) {
		DecimalFormat df =
				new DecimalFormat("##,##0,000");
		//empNo, name, workType, pay
		//정규직 직원 홍길동
		RegularWorker hong 
		= new RegularWorker("R1001", "홍길동", "정규직"
					, 20000000, 10 );
		printWorkerInfo(hong, df );
//		printWorkerInfo(hong.empNo, hong.name
//				, hong.workType, hong.getMonthPay(), df);
//		System.out.println("-------------");
//		System.out.println("사번: " + hong.empNo );
//		System.out.println("이름: " + hong.name );
//		System.out.println("근로형태: " + hong.workType );
//		System.out.println("월급여: " 
//					+ df.format( hong.getMonthPay() ) );
//		System.out.println("보너스: " + hong.bonus + "%");
//		System.out.println("-------------");

		
		//비정규직 직원 전우치
		TemporaryWorker jeon = 
		new TemporaryWorker("T1002", "전우치", "비정규직"
								, 20000000, 2);
		printWorkerInfo(jeon, df );
//		printWorkerInfo(jeon.empNo, jeon.name
//				, jeon.workType, jeon.getMonthPay(), df);
//		System.out.println("-------------");
//		System.out.println("사번: " + jeon.empNo );
//		System.out.println("이름: " + jeon.name );
//		System.out.println("근로형태: " + jeon.workType );
//		System.out.println("월급여: " 
//				+ df.format( jeon.getMonthPay() ) );
//		System.out.println("계약기간: " + jeon.period + "년");
//		System.out.println("-------------");
		
		
		//일용직 직원 박문수
		DailyWorker park =
		new DailyWorker("D1003", "박문수", "일용직", 80000);
		
		park.setWorkDays(15);
		//DailyWorker -> Worker (서브 -> 수퍼) : 자동형변환
		printWorkerInfo(park, df ); 
		
//		printWorkerInfo(park.empNo, park.name
//					, park.workType, park.getMonthPay(), df);
//		System.out.println("-------------");
//		System.out.println("사번: " + park.empNo );
//		System.out.println("이름: " + park.name );
//		System.out.println("근로형태: " + park.workType );
//		System.out.println("월급여: " 
//				+ df.format( park.getMonthPay() ) );
//		System.out.println("-------------");
	}
	
	//코드의 중복을 제거하고 메소드로 선언한 후 메소드 호출문으로 처리한다
	//다형성이 성립됨을 알고 있는 상태로 코드한다
	static void printWorkerInfo(Worker worker, DecimalFormat df ) {
		System.out.println("-------------");
		System.out.println("사번: " + worker.empNo );
		System.out.println("이름: " + worker.name );
		System.out.println("근로형태: " + worker.workType );
		System.out.println("월급여: " + df.format( worker.getMonthPay() ) );

		if( worker instanceof RegularWorker ) {
			//정규직근로자 라면
			//수퍼 -> 서브: 강제형변환(DownCasting)
			RegularWorker regular = (RegularWorker)worker;
			System.out.println("보너스: " + regular.bonus + "%");
		}else if( worker instanceof TemporaryWorker) {
			//비정규직근로자 라면
			TemporaryWorker temp = (TemporaryWorker)worker;
			System.out.println("계약기간: " + temp.period + "년");
		}else if( worker instanceof DailyWorker ) {
			//일용직근로자 라면
			DailyWorker daily = (DailyWorker)worker;
			System.out.println("근무일수: " + daily.workDays + "일");
		}
		System.out.println("-------------");
	}
	
	static void printWorkerInfo(String empNo
			, String name, String workType, int monthlyPay
			, DecimalFormat df ) {
		
		System.out.println("-------------");
		System.out.println("사번: " + empNo );
		System.out.println("이름: " + name );
		System.out.println("근로형태: " + workType );
		System.out.println("월급여: " + df.format( monthlyPay ) );
//		System.out.println("근무일수: " + park.workDays + "일");
		System.out.println("-------------");
	}
	
}
