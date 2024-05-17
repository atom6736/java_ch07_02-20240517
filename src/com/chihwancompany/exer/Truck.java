package com.chihwancompany.exer;

public class Truck extends Car { // Car클래스를 상속 왜 하필이면 확장(extend)이라는 표현을 썼을까?
	// 자식 클래스가 누릴 수 있는 재산이 부모재산인 2층에까지 미치기때문에 2층까지 화장되었다고 이해하는 것.
	
	int tire; // 타이어수
	int weight; // 차 무게

	public void setTire(int tire) {
		this.tire = tire;
	}

	public Truck() {
		super("소나타", 2022, "300","black");
		// TODO Auto-generated constructor stub
		// 상속을 받게 되면 위에서와 같은 부코초출문을 지우더라도 호출이 된다.
		// 왜냐하면 부모클래스를 1층에 짓고 2층에 자식클래스를 지을때 부모클래스는 안 불러도 자동으로 호출됨.
		// super는 부모생성자를 호출할때는 자동으로 호출되지만 인수를 넣어서 부모클래스를 호출할 때는 super를 명시해 주어야  함.
	}
	
	
	
}
