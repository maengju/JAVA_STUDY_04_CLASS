/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
----------------
문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
----------------
문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환
----------------
문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환
----------------
문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
 */
 



package class_;
import java.util.Scanner;
public class StringMain2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count=0,index=0,i;
		String str,present,change;
		
		System.out.print("문자열 입력 : ");
		str = scan.next();
		
		str=str.toLowerCase();   //문자열 소문자로 변환
		
		
		System.out.print("현재 문자열 입력 : ");
		present = scan.next();
		System.out.print("바꿀 문자열 입력 : ");
		change = scan.next();
		
		if(str.length()<present.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
		}else {
			while((index=str.indexOf(present,index))!=-1) {
				count++;
				index+= present.length();
			}//while
			
		
			str= str.replace(present, change);
			System.out.println(str);
			System.out.println(count+"개를 치환했습니다.");
		}
	}//메인

}
