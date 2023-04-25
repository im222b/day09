package set_get;

class TestClass03 {
	private String name;
	private int age;

	public void setName(String n)//set 과 get은 항상 같이 생성
	{
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
	    t.setName("홍길동");
	    System.out.println( t.getName() );
	    t.setAge( 10 );
	    int age = t.getAge();
	    System.out.println( age );
	}
}
