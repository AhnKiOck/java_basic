package ex_extends.animal;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.kind = "어떤 품종";
		Animal animal = new Animal("어떤 품종");
		animal.eat();
		animal.sleep();
		System.out.println("--------------");
		
		Dog dog = new Dog("진돗개");
//		dog.kind = "진돗개";
		dog.eat();
		dog.sleep();
		dog.run();
		System.out.println("--------------");
		
		Bird bird = new Bird("비둘기");
//		bird.kind = "비둘기";
		bird.eat();
		bird.sleep();
		bird.fly();
		System.out.println("--------------");
		
	}
}
