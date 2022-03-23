
public class CarMain {
	public static void main(String[] args) {
		Car hong = new Car();
		hong.owner = "박문수";
		hong.modelName = "K5";
		
		Car park = new Car("박문수", "K5");
		
		System.out.printf("차주: %s, 차종: %s \n"
								, park.owner, park.modelName );
		park.start();
		park.stepAccel();
		System.out.println("현재속도: " + park.speed);
		
		park.stepAccel();
		System.out.println("현재속도: " + park.speed);
		
		park.stepAccel();
		System.out.println("현재속도: " + park.speed);
		
		park.stepAccel();
		System.out.println("현재속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재속도: " + park.speed);
		
		park.stop();
	}
}
