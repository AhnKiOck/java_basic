package ex_poly.animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog("진돗개");
		dog1.sound();
		
		Animal dog2 = new Dog("말티즈");
		dog2.sound();
		
		Cat cat1 = new Cat("코리안 숏헤어");
		cat1.sound();
		
		Animal cat2 = new Cat("페르시안");
		cat2.sound();
		
		Chicken chicken1 = new Chicken("오골계");
		chicken1.sound();
		
		Animal chicken2 = new Chicken("금계");
		chicken2.sound();
		
	}
}
