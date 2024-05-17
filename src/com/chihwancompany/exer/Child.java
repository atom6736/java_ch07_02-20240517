package com.chihwancompany.exer;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super("홍길동"); // 부모클래스의 ㅅ애성자를 호출해우저야 함. 이러면 에러가 없어짐.
		// 아니면 부모클래스(Parent)에 부코클래스에 기본생성자를 넣어주어도 해결됨.
		
		this.name = name;
		this.studentNo = studentNo;
		// 자식 클래스에 생성자가 만들어지려면 부코클래스에 생성자를 호출해야 하는데
		// 보무클래스에 기본클래스가 없어지고 새로운 생성자가 나왔으니까 안되는 것.
		//그래서 부모클래스의 생성자를 호출해주어야 하는 것. super.를 호출해주어야 하는 것.
	}
	
}
