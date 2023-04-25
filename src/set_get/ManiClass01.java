package set_get;

/*
 this
 - 클래스 자기 자신의 주소를 저장하고 있는 변수
 - 메소드의 0번쨰 매개변수로 자동으로 만들어져 있다
  */
class TestClass01 {
	int num = 100;

	public void test() {
		int age;
		System.out.println("this : " + this);
		this.num =200;
		num = 2222; //this 를 사용해도 되고 삭제하고 사용해도 됌
	}
	public void test2() {
		int num =1234; // 이름이 같을 경우 현재 위치에 있는값을 우선시
		System.out.println(num); //가장 가까운 위치에 있는 값 실행
		System.out.println(this.num); //this를 사용하면 바깥에 있는 값을 실행
	}								  // this 는 바깥에 있는 값과 내부에 있는 값이 동일한경우
									  // 구분지어 사용할떄 사용
}

public class ManiClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		System.out.println( t );
		t.test(); // this 는 객체와 동일한 값을 가짐 this = t
		t.test2();
	}
}
