package variable;
class TestClass03{
	int num;/*객체지향변수 instance=객체 변수
	        일회성으로 사용할떈 지역변수 사용용이 
			여러변수에서 사용될떈 사용가능
			 제일 오래 살아남는 변수*/
	public void test01() { 
		num = 1000;  // 지역변수   사용되는 즉시 사라짐
		System.out.println("test01 : "+num);
	}
	public void test02() {
		num = 1000;
		System.out.println("test02 : "+num);
	}
}


public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t = new TestClass03();
	t.test01(); 
	t.test02();
	
}
}
