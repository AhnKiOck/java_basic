package library;

public class LibraryMain {
	public static void main(String[] args) {
		Book ant = new Book("863?ㅂ774개", "개미", "베르나르 베르베르");
		AppendixCD redhat = new AppendixCD("2020-04", "RedHat Fedora");
		//new Lendable();
		
		try {
			ant.checkOut("김철수", "2021-11-01");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			ant.checkOut("전우치", "2021-11-02");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		try {
			redhat.checkOut("홍길동", "2021-11-02");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		ant.checkIn();
		redhat.checkIn();
	}
}
