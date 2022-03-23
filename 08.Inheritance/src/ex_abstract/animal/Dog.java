package ex_abstract.animal;

public class Dog extends Animal{
	
//	String kind;
//	Animal(String kind){
//		this.kind = kind;
//	}
//	
//	//수퍼클래스인  Animal의 메소드에서는
//	//소리내는 형태를 구체적으로 표현할 수 없다
//	//메소드의 본체 {} 가 없이 ; 로 끝낸 형태의 메소드는 추상메소드이다
//	abstract void sound(); 

	//특성:품종
//	String kind;
	
	Dog(String kind){
		super(kind);
//		this.kind = kind;
	}
	
	//멍멍멍 소리를 낸다
	void sound() {
		System.out.println( kind + " 멍멍멍!");
	}
}
