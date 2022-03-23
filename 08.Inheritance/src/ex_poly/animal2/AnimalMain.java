package ex_poly.animal2;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal("어떤 동물");
		//메소드호출문
		doSomething(animal);
		
		Dog dog = new Dog("진돗개");
		//메소드호출문
		doSomething(dog);
		
		Bird bird = new Bird("비둘기");
		//메소드호출문
		doSomething(bird);
		
	}
	
	//메소드 선언: 다형성에의한 수퍼의 타입으로 파라미터 선언
	static void doSomething(Animal animal) {
		animal.eat();
		animal.sleep();
		if( animal instanceof Dog ) {
			Dog dog = (Dog)animal; //수퍼 -> 서브:다운캐스팅
			dog.run();
		}else if( animal instanceof Bird ) {
			Bird bird = (Bird)animal;
			bird.fly();
		}
	}
}
