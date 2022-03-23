package goods;

import java.util.Scanner;

public class GoodsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] goods = new Goods[10];
		goods[0] = new Goods("콜라", "DK01", 1250, 20);
		goods[1] = new Goods("캔커피", "DK02", 800, 10);
		goods[2] = new Goods("코코팜", "DK03", 1000, 40);
//		1.  goods[0]
//		2   goods[1]
//		3.  goods[2]
//		4.  goods[3]
		
		Managable add = new AddGoods(goods, sc);
//		AddGoods add = new AddGoods(goods, sc);
		Managable change = new ChangeGoods(goods, sc);
		Managable display = new DisplayGoods(goods);
		Managable remove = new RemoveGoods(goods, sc);
		Managable addStock = new AddStock(goods, sc);
		Managable subtractStock = new SubtractStock(goods, sc);
		
		int keep = 0; //yes:1, no:0		
		do {
			System.out.println("상품관리 프로그램");
			System.out.println("1.상품등록      2.상품변경      3.상품삭제");
			System.out.println("4.상품조회      5.상품입고      6.상품출고");
			System.out.print("기능번호 선택: ");
			
			switch( sc.nextInt() ) {
			case 1:
				display.displayGoods();
				add.addGoods();
				break;
			case 2:
				display.displayGoods();
				change.changeGoods();
				break;
			case 3:
				display.displayGoods();
				remove.removeGoods();
				break;
			case 4:
				display.displayGoods();
				break;
			case 5:
				display.displayGoods();
				addStock.addStock();
				break;
			case 6:
				display.displayGoods();
				try {
					subtractStock.subtractStock();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			System.out.print("계속? (예/아니오:1/0) ");
			keep = sc.nextInt();
			
		}while( keep != 0 );
		
		sc.close();
	}
}
