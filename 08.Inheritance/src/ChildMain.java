
public class ChildMain {
	public static void main(String[] args) {
		Child child = new Child("필드", 0);
		System.out.println( child.field );
		System.out.println( child.no );
		child.parentMethod();
		child.childMethod();
		
		Parent parent;
		
		Child c1 = new Child("데이터", 10);
		parent = (Parent)c1; 
		//Child -> Parent 형변환(서브 -> 수퍼)
		//자동형변환 발생 : UpCasting 
		parent.parentMethod();
		//parent.childField; //접근불가
		//parent.childMethod();//접근불가
		if( parent instanceof Child ) {
			Child c = (Child)parent;
			c.childMethod();
		}
		
		byte no1 = 100;
		int no2;
		//byte < short < int < double
		no2 = (int)no1; //byte -> int
		
		short no3; 
		no3 = (short)no2; //int -> short
		
		
		//Parent -> Child 형변환(수퍼 -> 서브)
		//강제형변환 해야 함: DownCasting
		c1 = (Child) parent;
		c1.childMethod();
		c1.parentMethod();
		
	}
}
