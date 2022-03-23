
abstract public class Parent {
	String field;
	int no;
//	Parent(){}
	Parent(String field, int no){
		this.field = field;
		this.no = no;
	}
	
	 abstract void parentMethod() ;
		//구체적인 로직을 처리할 수 없는 경우
		//System.out.println("Parent 메소드 ");
}
