package com.chihwancompany.exer2;

public class Triangle extends Shape {

	@Override // 이렇게 골뱅이 하고 되어 있는 것을 annotation 명시하다 라고 함. 생갹해도 에러는 안 남. 
	public void areaPrint() {
		// TODO Auto-generated method stub
		super.areaPrint(); // 부모클래스에서 정의된 원본 메소드 호출
		System.out.println(width*height*0.5);
		//super.areaPrint(); // 이 부분은 지우고 우리가 원하는 내용으로 바꾸면 된다고. 즉 0.5곱하기까지.
		
	} //shape클래스를 상속 받음.

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름 : Triangle");
//	}
	
//	public void areaPrint() { // 오버라이딩 -> 삼각형 넓이 출력
//		System.out.println(width*height*0.5);  부모것을 상속받은 후 0.5를 더 곱하는 것으로 튜닝한 것. 이것이 오러라이딩
//		메소드를 새로 쳐 줄 수도 있지만 부모것을 상속받아 그것을 토대로 변형하는 방법이 더 유용함.
//		만일 클래스마다 이름이 다 다르면 통일성이 없어 어떤 것을 실행해야 할지 혼동되게 함.
//		그러므로 상속을 받아 오버라이딩 하면 이런 혼동을 제거할 수 있는 표준을 강요하는 것.
//		그리고 코딩할 때 가독성도 좋음 왜냐하면 다 areaPrint로 계산하면 되니까. 장점이 많음.

	

}
// 이것도 자동완성이 있다. 이것은 source에 overide가 있다.






