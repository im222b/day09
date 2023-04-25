package variable;
/*
 입력 , 연산 , 출력 기능을 만들어 주세요
 입력 : 이름 , 국,영,수
 연산 : 합을 구하는 기능 , 평균을 구하는 기능 , 등급을 구하는 기능
 출력 : 이름 국 , 영 , 수 , 합 , 평균 , 등급
 등급 : 평균이 90이상 A, 80이상 B ,나머진 C
 */
public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 t = new TestClass08();
		t.MyInPut();
		t.setavg();
		t.display();
		
	}
}
