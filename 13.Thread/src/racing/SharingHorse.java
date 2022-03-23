package racing;

public class SharingHorse {
	int rank;
	synchronized void finishLine(int no, String name) {
		rank++;
		System.out.printf("%d위 %d번 경주마 [%s] \n"
				, rank, no, name);
	}
	/*
	void finishLine(int no, String name) {
		synchronized(this) {
			rank++;
			System.out.printf("%d위 %d번 경주마 [%s] \n"
									, rank, no, name);
		}
	}
	*/
}
