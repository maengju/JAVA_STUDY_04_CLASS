package basic;

import java.io.IOException;

public class MemberMain { //메인을 가지고만 있지 따로 하는일은 없다. 자바의 단점

	public static void main(String[] args) throws IOException {

		MemberService ms = new MemberService();
		
		ms.menu();//호출
		
		System.out.println("프로그램을 종료합니다.");
		
		

	}

}
