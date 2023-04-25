package set_get;

import java.util.ArrayList;
import java.util.Scanner;

/*
 로그인 프로그램 만들어 주세요
 loginClass
 	private id, pwd
 	각 set, getter 생성 및 연산하는 기능
 MainClass
 	보여지는 기능을 만들자
 	1.로그인
 	2.회원가입	
 	3.종료
 */

class LoginClass {
	Scanner input = new Scanner(System.in);
	private String id;
	private int pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	class Input {
		int num;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();

			switch (num) {
		
			case 1: //로그인
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				if (Id().contains(inputId)) {
					if (pwd.contains(inputPwd)) {
				System.out.println("로그인 완료");
					} else {
						System.out.println("존재하지 않는 회원입니다");
					}
				}
				break;
			
			case 2: // 회원가입
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				System.out.print("이름 입력 : ");
				inputName = input.next(); // 입력 방식
				System.out.print("전화번호 입력 : ");
				inputPhone = input.next();
				if (!id.contains(inputId)) {// 받은 입력값이 기존에 있던값인지 확인
					if (!name.contains(inputName)) {
						id.add(inputId);
						pwd.add(inputPwd);
						name.add(inputName); // arr로 등록
						phone.add(inputPhone);
						System.out.println("등록완료");
					} else {
						System.out.println("등록된 아이디 입니다.");
					}
				} else {
					System.out.println("이미 등록된 회원입니다");
				}
				break;

			
			
			
			case 3: //종료
				System.out.println("종료");
				System.exit(1);
			}
		}
	}
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LoginClass t = new LoginClass();
		int num;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();

			
}
}
}
