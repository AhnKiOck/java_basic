package goods;

import java.util.Scanner;

public interface Managable {
	void addGoods(); // 상품등록

	void displayGoods(); // 상품조회

	void changeGoods(); // 상품변경

	void removeGoods(); // 상품삭제 필수 사항

	// 추가사항: 입고, 출고
	void addStock();

	void subtractStock() throws Exception;

	default int checkMinus(int value, Scanner sc, int what) {
		int standard = 0;
		if (what == 1)
			++standard;
		while (value < standard) {
			if (what == 1) {
				System.out.print("상품가격은 양수 --> 재입력: ");
			} else if (what == 2) {
				System.out.print("상품수량은 0이상 --> 재입력: ");
			}
			value = sc.nextInt();
		}
		return value;
	}

	default int selectedNo(Goods goods[], int no) {
		int cnt = 0;
		for (int idx = 0; idx < goods.length; idx++) {
			if (goods[idx] == null)
				continue;
			if (no == ++cnt) {
				return idx;
			}
		}
		System.out.println("미등록된 상품번호!");
		return -1;
	}
}
