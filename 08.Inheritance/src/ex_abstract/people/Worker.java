package ex_abstract.people;

public class Worker extends People{
	String workerNo;
	
	Worker(String name, int age, String workerNo){
		super(name, age);
		this.workerNo = workerNo;
	}
	
	void go() {
		System.out.println( name + " 출근한다");
	}
}
