package thisex;

/*
 * this 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); // 태어난 연도 변경
		System.out.println(bDay); // 변수 bDay 출력
		bDay.printThis(); // 변수 this 출력. 위와 같은 값이 출력됨
	}
}

class BirthDay {
	int year;

	public void setYear(int year) {
		this.year = year; 
	}

	public void printThis() {
		System.out.println(this);
	}
}