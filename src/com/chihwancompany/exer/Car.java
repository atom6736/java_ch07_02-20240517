package com.chihwancompany.exer; 
// 상속에 대한 연습
public class Car {

	
	String modelName;  //모델명
	int modelYear;  // 년식
	String horsePower; // 마력
	String color; // 차 색깔

	public void printModel() {
		System.out.println("자동차 모델명"+this.modelName);
		
	}
	
	public Car() {
		System.out.println("Car클래스(부모클래스) 생성자 호출");
	}

	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
		// 이층집을 초기화하고 싶어 위와 같은 인수를 입력하면 그럴때에는 부코클래스 생성자 호출super();이 비로소 필요하게 된다ㅏ. 
	}
	
	
	
}
