package variable;

class TestClass04 {
	// int num = 1000; 변수가 생성되는 시점은 객체가 만들어야 생성된다
	static int num = 1000; // 제일 처음으로 만들어지고 제일 오래 살아남는다
	int abc;

	public void test1() {
		test02();
		abc = 100;
	}

	public void test2() {

	}
}

public class MainClass04 {
	public static void main(String[] args) {
		// num = 100;
		TestClass04.num = 444;
	}

	public void test() {
		System.out.println("test");
	}
}
