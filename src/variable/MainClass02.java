package variable;
class TestClass02{
	int test = 1111; //큰 범위에서 만든 값은 작은범위에서 사용 가능 
	public int test01() {
		int num = 100;
		System.out.println("test01 "+ num);
		System.out.println("test01 "+ test);
		
		return num;
	}
	public void test02(int num) {
		
		System.out.println("test02 "+ num);
		System.out.println("test02 "+ test);
	}
}



public class MainClass02 {
public static void main(String[] args) {
	
}
}
