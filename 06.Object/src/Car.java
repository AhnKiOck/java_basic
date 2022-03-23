
public class Car {
	//데이터(필드): 소유주, 차종, 속도
	String owner, modelName;
	int speed;
	
	//default 생성자
	Car(){}
	
	//차주,차종 을 초기화하는 생성자 선언문
	Car(String name, String model){
		owner = name;
		modelName = model;
	}
	
	//기능(메소드): 출발한다. 엑셀을 밟는다. 브레이크를 밟는다. 멈춘다
	void start() {
		System.out.println("시동을 건다");
	}
	void stop() {
		System.out.println("주차한다");
	}
	
	//브레이크를 밟는다: 30만큼 감속한다
	//속도가 마이너스가 될 수는 없으니 최저속도 10으로 유지한다
	void stepBreak() {
		//speed = speed - 30;
		speed -= 30;
		if( speed<0 ) {
			speed = 10;
		}
	}
	
	
	//엑셀을 밟는다 : 40만큼 증가한다
	//과속되지 않도록 속도가 100 넘으면 최고속도를 100으로 한다
	void stepAccel() {
		//speed = speed + 40;
		speed += 40;
		if( speed > 100 ) {
			speed = 100;
			System.out.println("속도 유지:" + speed);
		}
	}
	
}

