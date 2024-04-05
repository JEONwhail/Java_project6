package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요 (인스턴스변수,클래스변수 / 전역변수,지역변수)
 * */
class Person {
	//인스턴스
	// 전역변수라서 클래스 끝나기 전 까지 사용가능
	String personName; //인스턴스 생성에 사용 가능
	int personAge;
	
	//클래스
	// 전역변수라서 클래스 끝나기 전 까지 사용가능
	static char gender = 'F'; //인스턴스를 생성Xx 사용 가능	
	
	//지역
	//지역변수는 메소드 안에서만 사용 가능
	public void setPersonName(String name) {
		this.personName = name; //in 메소드
	}
	
	public void setPersonAge(int age) {
		this.personAge = age; // just in 메소드
	}
	
}


