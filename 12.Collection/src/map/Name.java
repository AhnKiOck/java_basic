package map;

public class Name {
	String lastName, firstName;
	Name(String lastName, String firstName){
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	//원래  hashCode() 메소드를 오버라이딩 하여 
	//같은  해쉬코드값을 갖도록 처리를 구현한다
	//상속관계에서 서브가 수퍼의 메소드 오버라이딩시
	//접근제어자는 수퍼의 접근제어자와 같거나 더 넓은 범위만 지정할 수 있다
	public int hashCode() {
		//return lastName.hashCode() + firstName.hashCode();
		return (lastName + firstName).hashCode();
	}
	
	public boolean equals(Object obj) {
		if( ! (obj instanceof Name) ) return false;
		Name name = (Name)obj; //Object -> Name 변환
		if( lastName.equals(name.lastName) 
				&& firstName.equals(name.firstName) )
			return true;
		else
			return false;
	}
}









