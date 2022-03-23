package test;

public class TestMain {
	public static void main(String[] args) {
		A ab = new B();
		ab.method();
		
		B bc = new C();
		bc.method();
		
		A ac = new C();
		ac.method();
	}
}
