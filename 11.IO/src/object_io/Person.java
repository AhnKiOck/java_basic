package object_io;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	transient int age;  // 직렬화대상에서 제외하려면  transient 지정
	char gender;
	
	Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
