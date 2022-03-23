package ex_abstract.animal;

public class Cat extends Animal{
//	String kind;
	
	Cat(String kind){
		super(kind);
//		this.kind = kind;
	}
	
	void sound() {
		System.out.println( kind + " 야옹야옹~");
	}
}
