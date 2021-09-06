package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberService {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name, phoneNum, address;
    int age;
	
	
	MemberDTO[] md = new MemberDTO[5];
	
    
	public void menu() throws IOException{
		int num;
		while(true) {
			System.out.println("***********");
			System.out.println("1.가입");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.탈퇴");
			System.out.println("5.끝내기");
			System.out.println("***********");
			System.out.print("번호 : ");
			num = br.read()-48;
			br.read();
			br.read();
			if(num==5)break;
			if(num==1)insertMember();	
			else if(num==2)list();
			else if(num==3)updateMember();
			else if(num==4)deleteMember();
		}//while
	}//menu()
	
	public void insertMember() throws IOException {
		int i;
		int count=0;
		for(i=0;i<md.length; i++) {
        	if(md[i]==null) break;
        }
		if(i==md.length) {
			System.out.println("정원초과");
			return; // 메소드가 void일경우 return은 값을 가지지 않고 그냥 메소드를 나가게 된다.
		}
		md[i] = new MemberDTO();
		
        System.out.print("이름 입력 : ");
        name = br.readLine();
        System.out.print("나이 입력 : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("핸드폰 입력 : ");
        phoneNum = br.readLine();
        System.out.print("주소 입력 : ");
        address = br.readLine();
        
        
        
        md[i].setName(name);
        md[i].setAge(age);
        md[i].setPhoneNum(phoneNum);
        md[i].setAddress(address);
        
        for( i=0; i<md.length; i++) {
        	if(md[i] == null)count++;
        }
        System.out.println();
        System.out.println("등록완료");
        System.out.println(count + "자리가 남았습니다.");
    }//insertMember()입력
	
	public void list() {
		System.out.println();
		int i;
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		
		for(i=0;i<md.length;i++) {
			if(md[i]!=null) {
			System.out.println(md[i].getName()+"\t"+md[i].getAge()+"\t"+
								md[i].getPhoneNum()+"\t"+md[i].getAddress());
			}
		}	
	}//list()출력
	
	public void updateMember() throws IOException {
		System.out.print("핸드폰 번호 입력 : ");
		String updatePhoneNum = br.readLine();
		int i;
		for(i=0;i<md.length;i++) {
			if(md[i] != null) {
				if(md[i].getPhoneNum().equals(updatePhoneNum)) {
			        break;
				}//if
			}
		}//for	
		if(i==md.length) {
			System.out.println("찾고자하는 회원이 없습니다.");
			return;
		}
		System.out.println(md[i].getName()+"\t"+md[i].getAge()+"\t"+
				md[i].getPhoneNum()+"\t"+md[i].getAddress());
		
		System.out.print("수정할 이름 입력 : ");
        name = br.readLine();
        System.out.print("수정할 나이 입력 : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("수정할 핸드폰 입력 : ");
        phoneNum = br.readLine();
        System.out.print("수정할 주소 입력 : ");
        address = br.readLine();
        md[i].setName(name);
        md[i].setAge(age);
        md[i].setPhoneNum(phoneNum);
        md[i].setAddress(address);
        System.out.print("\n수정완료\n");
	}//수정
	
	public void deleteMember() throws IOException {
		int i;
		System.out.print("핸드폰 번호 입력 : ");
		String deletePhoneNum = br.readLine();
		
		for(i=0;i<md.length;i++) {
			if(md[i]!=null) {
				if(md[i].getPhoneNum().equals(deletePhoneNum)) {
			        break;
				}
			}//if
		}//for
		if(i==md.length) {
			System.out.println("찾고자하는 회원이 없습니다.");
			return;
		}
		md[i]=null;
		System.out.println("탈퇴완료");
		
	}//탈퇴
	
}
