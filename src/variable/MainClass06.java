package variable;

class TestClass06 {
	private int num = 100;  //보통 변수를 만들떈 프라이빗으로 만든다 외부에서 접근이 안된다
	public void test() {  //내부에선 접근이 가능
		num =1111;
	}
	public void test2() {
		System.out.println( num );
	}
	public static final String KOREA = "대한민국"; //값을 변경할수 없음 (무조건 대문자로)
	public static final String PATH = "C드라이브 특정위치"
}


public class MainClass06 {
public static void main(String[] args) {
	TestClass06 t = new TestClass06();
	t.test();
	t.test2();

	
	
}
}
