package ex_abstract.animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("진돗개");
		dog.sound();
		
		Cat cat = new Cat("코리안 숏헤어");
		cat.sound();
		
		Chicken chicken = new Chicken("오골계");
		chicken.sound();
		
	}
}
