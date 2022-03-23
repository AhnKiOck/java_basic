package goods1;

import java.util.Scanner;

public class GoodsMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[10];
		
		System.out.println("\t상품 관리 시스템 ON");
		
		menu: while(true) {
			int menuChoice = menu(scanner);
			Managable manage = new Goods(goods, scanner);
			switch(menuChoice) {
			case 1:
				manage.addGoods();
				break;
			case 2:
				manage.changeGoods();
				break;
			case 3:
				manage.displayGoods();
				break;
			case 4:
				manage.removeGoods();
				break;
			case 5: 
				manage.addStock();
				break;
			case 6:
				manage.subtractStock();
				break;
			case 7:
				System.out.println("\t상품 관리 시스템 OFF");
				break menu;
			}
		}
	}

	private static int menu (Scanner scanner) {
		int choice=7;
		while(true) {
			System.out.println();
			System.out.println("1.상품추가 2.상품변경 3.상품조회 4.상품삭제 5.입고  6.출고 7.종료");
			choice = Input.inputInt(scanner);
			if(Input.intScope(1, 7, choice, "메뉴"))break;
		}
		return choice;
	}
}