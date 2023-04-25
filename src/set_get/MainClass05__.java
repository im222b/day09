package set_get;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class MainClass05__ {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      LoginClass04 t = new LoginClass04();
	      ArrayList<String> id_arr = new ArrayList<>();
	      ArrayList<String> pwd_arr = new ArrayList<>();
	      String id = null, pwd = null;
	      
	      while(true) {
	         System.out.println("=====번호를 선택하세요=====\n");
	         System.out.println("1. 로그인");
	         System.out.println("2. 회원가입");
	         System.out.println("3. 종료");
	         System.out.print("\n번호 입력: ");
	         
	         int num = sc.nextInt();
	         switch(num) {
	         case 1:
	            System.out.print("ID 입력: ");
	            String id1 = sc.next();
	            System.out.print("비밀번호 입력: ");
	            String pwd1 = sc.next();
	            if(id_arr.contains(id1)) {
	               if(pwd_arr.contains(pwd1)) {
	                  System.out.println("\nLogin 성공!\n");
	                  System.exit(1);
	                  break;
	               }
	            } else {
	               System.out.println("\nLogin 실패!\n");
	            } break;
	            
	         case 2:
	            System.out.print("가입할 ID 입력: ");
	            t.set_id();
	            System.out.print("가입할 비밀번호 입력: ");
	            t.set_pwd();
	            
	            id = t.get_id();
	            pwd = t.get_pwd();
	            
	            if(!id_arr.contains(id)) {
	               if(!pwd_arr.contains(pwd)) {
	                  id_arr.add(id);
	                  pwd_arr.add(pwd);
	                  break;
	               } 
	            } else {
	               System.out.println("이미 존재하는 ID입니다.");
	            }
	            break;
	            
	         case 3:
	            System.out.println("=====종료합니다.=====");
	            System.exit(1);
	         }
	      }
	   }
	}

	class LoginClass04 {
	   private String id, pwd;
	   Scanner sc = new Scanner(System.in);
	   
	   public void set_id() {
	      this.id = sc.next();
	   }
	   
	   public void set_pwd() {
	      this.pwd = sc.next();
	   }
	   
	   public String get_id() {
	      return id;
	   }
	   
	   public String get_pwd() {
	      return pwd;
	   }
	}

