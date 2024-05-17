package com.chihwancompany.exer;

public class Parent {
	
	public String name;
		
		public Parent(String naem) {
			this.name =name; // 이 두줄이 parent클래스의 생성자. 그런데 String name을 받게 되어 있으니가 기본생성자가 아님.
			// 왜냐하면 기본생성자는 괄호안에 아무것도 없는 것이니까.
			// 그러면 기본생성자가 안 만들어진 상태에서 필드가 들어있는 생성자를 만들면, 기본생성성자는 생략된 것이 아니라 아예 없어져버리기 대문에
			// 사용할 수가 없다. 
			// 그래서 기본생성자와 필드생성자를 꼭 만들어주어야 함.
		
	}

}
