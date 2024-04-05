package object;

/* 손님이 카페에서 커피를 사는 과정 구현하세요.
 * 
 * 10000원을 가진 둘리는 별다방 카페에서 4000원을 내고 아메리카노를 샀습니다.
 * 20000원을 가진 또치는 별다방 카페에서 4500원을 내고 라떼를 샀습니다.
 * 단, 소지금이 가격보다 적으면 커피를 살 수 없습니다.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리", 10000);
		Cafe starCafe = new Cafe("별다방");
		customer1.buyAmericano(starCafe);
		customer1.showInfo();

		Customer customer2 = new Customer("또치", 20000);
		customer2.buyLatte(starCafe);
		customer2.showInfo();

		starCafe.showInfo();

	}
}

// 카페 클래스
class Cafe {

	String cafeName;
	int money;

	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	public void showInfo() {
		// TODO Auto-generated method stub

	}

	public void sellCoffee(int money) {
		this.money = this.money + money;
	}

}

// 손님클래스
class Customer {

	String customerName;
	int money;

	public Customer(String name, int money) {
		this.customerName = name;
		this.money = money;
	}

	// 아메리카노
	public void buyAmericano(Cafe cafe) {
		if (money < 4000) {
			System.out.println(customerName + "의 돈이 없는 걸 확인. 승인 불가");
			return;
		}
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}

//라떼
	public void buyLatte(Cafe cafe) {
		if (money < 4500) {
			System.out.println(customerName + "의 돈이 없는 걸 확인. 승인 불가");
			return;
		}
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}

	public void showInfo() {
		System.out.println(customerName + "의 남은 돈은 " + money + "입니다.");
	}

}
