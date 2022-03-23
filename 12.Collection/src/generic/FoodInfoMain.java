package generic;

public class FoodInfoMain {
	public static void main(String[] args) {
		//120ml 용량의 음료수 생성
//		 Drink drink = new Drink(120);
//		 FoodInfo d = new FoodInfo( drink );
		FoodInfo drink = new FoodInfo( new Drink(120) );
		//생성한 먹거리 음료 객체 drink  의 용량 파악
		Drink d = (Drink)drink.food;
		System.out.println("음료의 용량: " + d.getMl());
		
		
		//먹거리 새우깡 스낵 생성
		FoodInfo shrimp = new FoodInfo( "새우깡" );
		Snack snack = (Snack)shrimp.food;
		System.out.println("새우깡 스낵의 용량: " + snack.getMg() );
		
		
		
		
		
		
		
		
		
	}
}
