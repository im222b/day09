package variable;

import java.util.Scanner;

class TestClass08 {
    private String name, grade;
    private int kor, eng, math, sum;
    private double avg;
    public void MyInPut() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("학년 입력");
		grade = input.next();
		System.out.println("국어 점수 입력");
		kor = input.nextInt();
		System.out.println("영어 점수 입력");
		eng = input.nextInt();
		System.out.println("수학 점수 입력");
		math = input.nextInt();
		}
    public void setavg() {
		sum = kor + eng +  math;
		avg = sum / 3;
		}
    
		
    public void display() {
    	System.out.println("이름 : "+ name);
		System.out.println("학년 : "+ grade);
		System.out.println("국 : "+ kor);
		System.out.println("영 : "+ eng);
		System.out.println("수 : "+ math);
		System.out.println("합 : "+ sum);
		if(avg >=90) {
	    	System.out.println("A 등급입니다");
	    }else if(avg >=80) {
	    	System.out.println("B 등급입니다");
	    }else {
	    	System.out.println("C등급입니다");
	    }
	    
		
    }
    
}
