package com.chihwancompany.exer2;

public class Shape {
	
	int width=10; //가로길이
	int height=20; //세로길이
	String name = "도형";
	
	public void areaPrint() {
		System.out.println(this.width*this.height);
	}

	public final void namePrint() { // final 키워드가 메소드 선언에 추가되면 해당 메소드는 오버라이딩 불가.
		System.out.println("도형이름 : shape");
	}
}
