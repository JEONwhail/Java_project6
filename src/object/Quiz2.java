package object;

/* 학생이 택시에 타는 과정을 구현하세요.
 * 
 * 둘리 학생이 택시를 타고 학교에 갑니다.
 * 택시요금은 10000원을 지불했습니다.
 * 단, 소지금이 만원보다 적으면 택시에 탈수없습니다.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		Student2 student = new Student2("둘리", 40000); 
		Taxi taxi = new Taxi("둘리택시"); 
		student.takeTaxi(taxi); 
		student.showInfo(); 
		taxi.showInfo(); 
		
	}
}

class Taxi {
	String taxiNumber; 
	int money; 

	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println( taxiNumber + "의 수입은 = " + money + "임당" );
	}

}

class Student2 {
	String studentName; 
	int money; 

	public Student2(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) {
		if (money < 10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없어요...유감..어른 모시고 다시오렴~");
			return;
		}
		taxi.take(10000); 
		this.money = this.money - 10000; 
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}

}
