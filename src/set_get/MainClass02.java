package set_get;

class TestClass02{
	private int age;
	public void setAge(int age) { //이름을 변경한다면 this를 사용할 이유는 없음
		this.age = age -1;
	}
	public void PrintAge( ) {
		System.out.println( age);
	}
}

public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t = new TestClass02();
	t.setAge( 20 );
	t.PrintAge();
}
}
