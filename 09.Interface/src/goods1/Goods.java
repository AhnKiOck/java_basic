package goods1;

import java.util.Scanner;

public class Goods implements Managable{

	private String id, name;
	private int price, stock;
	private Goods[] goods;
	Scanner scanner;
	
	public Goods(String id, String name, int price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public Goods(Goods[] goods, Scanner scanner) {
		this.goods=goods;
		this.scanner=scanner;
	}
	
	@Override
	public void addGoods() {
		System.out.println("\t<< 상품 추가 >>");
		displayGoods();
		int index;
		System.out.println("상품을 추가하실 목록 번호를 입력해주세요.(1~10)");
		System.out.println("메뉴로 나가시려면 0번을 입력해주세요.");
		while(true) {
			index = Input.inputInt(scanner);
			if(index==0) {
				return;
			}
			if(!Input.intScope(1, 10, index, "목록"))continue;
			if(goods[index-1]!=null) {
				System.out.println("이미 상품이 저장된 번호입니다. 다른 번호를 선택해주세요.");
				continue;
			}else break;
		}
		System.out.println("추가하실 상품의 정보를 입력해주세요.");
		System.out.println("상품이름: ");
		String name = scanner.next();
		System.out.println("상품코드: ");
		String id = scanner.next();
		int price;
		while(true) {
			System.out.println("상품가격: ");
			price = Input.inputInt(scanner);
			if(Input.intPositive(price, "가격")) break;
		}
		int stock;
		while(true) {
			System.out.println("상품재고: ");
			stock = Input.inputInt(scanner);
			if(Input.intPositive(stock, "재고")) break;
		}
		Goods newGood = new Goods(id, name, price, stock);
		goods[index-1]=newGood;
		System.out.println(name+" 상품 저장되었습니다.");
	}

	@Override
	public void displayGoods() {
		System.out.println("\t[상품 목록]");
		System.out.println("번호\t상품이름\t상품코드\t상품가격\t상품재고");
		for(int i=0; i<goods.length; i++) {
			if(goods[i]!=null) {
				System.out.printf("[%02d]\t%s\t%s\t%d\t%d\t\n",
						i+1, goods[i].getName(), goods[i].getId(), goods[i].getPrice(), goods[i].getStock());
			}else {
				System.out.printf("[%02d]\t\t%s\n",
						i+1, "-- 상품 정보 없음 --");
			}
		}
	}

	@Override
	public void changeGoods() {
		System.out.println("\t<< 상품 변경 >>");
			System.out.println("아래 목록에서 변경하실 상품의 번호를 입력해주세요.");
			System.out.println("메뉴로 나가시려면 0번을 입력해주세요.");
			displayGoods();
		while(true) {
			int choice = Input.inputInt(scanner);
			if(choice==0) {
				break;
			}
			if(Input.intScope(1, 10, choice, "목록"))continue;
			if(goods[choice-1]==null) {
				System.out.println("상품이 등록되지 않은 번호입니다. 번호를 다시 선택해주세요.");
				continue;
			}else{
				String name = goods[choice-1].getName();
				System.out.println(name+" 상품을 변경합니다.");
				System.out.println("변경하실 정보를 입력해주세요.");
				System.out.println("상품이름 :"+goods[choice-1].getName()+" >>");
				goods[choice-1].setName(scanner.next());
				System.out.println("상품코드 :"+goods[choice-1].getId()+" >>");
				goods[choice-1].setId(scanner.next());
				System.out.println("상품가격 :"+goods[choice-1].getPrice()+" >>");
				int price;
				while(true) {
					price = Input.inputInt(scanner);
					if(Input.intPositive(price, "가격")) break;
				}
				goods[choice-1].setPrice(price);
				System.out.println("상품재고 :"+goods[choice-1].getStock()+" >>");
				int stock;
				while(true) {
					stock = Input.inputInt(scanner);
					if(Input.intPositive(stock, "재고")) break;
				}
				goods[choice-1].setStock(stock);
				System.out.println(name+" 상품을 변경하였습니다.");
				break;
			}
		}
	}

	@Override
	public void removeGoods() {
		System.out.println("\t<< 상품 삭제 >>");
		System.out.println("아래 목록에서 삭제하실 상품의 번호를 입력해주세요.");
		displayGoods();
		while(true) {
			int choice = Input.inputInt(scanner);
			if(choice==0) {
				break;
			}
			if(!Input.intScope(1, 10, choice, "목록"))continue;
			if(goods[choice-1]==null) {
				System.out.println("상품이 등록되지 않은 번호입니다. 번호를 다시 선택해주세요.");
				System.out.println("메뉴로 나가시려면 0번을 입력해주세요.");
				continue;
			}else {
				String name = goods[choice-1].getName();
				goods[choice-1]=null;
				System.out.println(name+" 상품이 삭제되었습니다.");
				break;
			}
		}
	}
	@Override
	public void addStock() {
		changeStock(1);

	}
	@Override
	public void subtractStock() {
		changeStock(-1);
	}
	
	public void changeStock(int plusOrMinus) {
		String addOrSubstract;
		if(plusOrMinus>=0) {
			addOrSubstract="입고";
		}else {
			addOrSubstract="출고";
		}
		System.out.println("\t<< "+addOrSubstract+" >>");
		System.out.println("아래 목록에서 "+addOrSubstract+"하실 상품의 번호를 입력해주세요.");
		displayGoods();
		while(true) {
			int choice = Input.inputInt(scanner);
			if(choice==0) {
				break;
			}
			if(!Input.intScope(1, 10, choice, "목록"))continue;
			if(goods[choice-1]==null) {
				System.out.println("상품이 등록되지 않은 번호입니다. 번호를 다시 선택해주세요.");
				System.out.println("메뉴로 나가시려면 0번을 입력해주세요.");
				continue;
			}else{
				String name = goods[choice-1].getName();
				System.out.println(name+" 상품을 "+addOrSubstract+"합니다.");
				System.out.println(addOrSubstract+"한 수량을 입력해주세요.");
				int change;
				while(true) {
					change = Input.inputInt(scanner);
					if(Input.intPositive(change, addOrSubstract+"량")) break;
				}
				if(plusOrMinus>=0) {
					goods[choice-1].setStock(goods[choice-1].getStock()+change);
				}else {
					if(goods[choice-1].getStock()-change<0) {
						System.out.println("출고량이 재고량보다 많을 수 없습니다. 재고량이 변경되지 않습니다.");
					}
					else goods[choice-1].setStock(goods[choice-1].getStock()-change);
				}
				System.out.println("변경 후 재고량: "+goods[choice-1].getStock());
				break;
			}
		}
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}