package set;


public class Student {
//	강소라,여,010-1234-7701,rkdthfk@naver.com
	String name, gender, phone, email;
	Student(String name, String gender, String phone, String email){
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	public int hashCode() {
		return (name+gender+phone+email).hashCode();
	}
	
	public boolean equals(Object obj) {
		if( !(obj instanceof Student) ) return false;
		Student student = (Student)obj; //Object -> Student  로 형변환
		if( name.equals(student.name) 
				&& gender.equals(student.gender) 
				&& phone.equals(student.phone) 
				&& email.equals(student.email) )
			return true;
		else
			return false;
	}
	
	
}
