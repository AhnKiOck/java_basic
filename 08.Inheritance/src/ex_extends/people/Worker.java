package ex_extends.people;

//직장인 클래스
public class Worker extends People{
	//필드: 이름, 나이, 사번
	String workerNo;
	
	//출근한다
	void gotoWork() {
		System.out.println( name + " 출근한다" );
	}
	
}
