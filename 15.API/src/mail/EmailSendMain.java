package mail;

import java.util.Scanner;

public class EmailSendMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String userid = sc.nextLine() ;
		userid += "@naver.com";
		System.out.print("비밀번호: ");
		String userpw = sc.nextLine();
		
		EmailSender sender 
			= new EmailSender( userid, userpw, "관리자");
		
		System.out.print("메일받을사람이메일: "); //hong@naver.com
		userid = sc.nextLine();
		System.out.print("메일받을사람이름: ");
		String name = sc.nextLine();
		sender.sendAttach( userid, name );
//		sender.sendEmail( userid, name );
		
		sc.close();
	}
}
