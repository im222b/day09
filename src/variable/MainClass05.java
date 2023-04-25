package variable;

class TestClass05 {
	static int num; // 미리 만들어 논다는 개념
	static {
		num = 1000;
	}

	public void test() { // 나중에 사용하겠다는 개념
		System.out.println("nun :" + num);
	}

	static int n1 = 100;

	public static void test2() {
		System.out.println("n1 :" + n1);
	}
}

public class MainClass05 {
	static int num = 100;

	public static void main(String[] args) {
		System.out.println(num);
		
		
	}
}
