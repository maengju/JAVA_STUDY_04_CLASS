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
			System.out.println("1.����");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.println("4.Ż��");
			System.out.println("5.������");
			System.out.println("***********");
			System.out.print("��ȣ : ");
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
			System.out.println("�����ʰ�");
			return; // �޼ҵ尡 void�ϰ�� return�� ���� ������ �ʰ� �׳� �޼ҵ带 ������ �ȴ�.
		}
		md[i] = new MemberDTO();
		
        System.out.print("�̸� �Է� : ");
        name = br.readLine();
        System.out.print("���� �Է� : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("�ڵ��� �Է� : ");
        phoneNum = br.readLine();
        System.out.print("�ּ� �Է� : ");
        address = br.readLine();
        
        
        
        md[i].setName(name);
        md[i].setAge(age);
        md[i].setPhoneNum(phoneNum);
        md[i].setAddress(address);
        
        for( i=0; i<md.length; i++) {
        	if(md[i] == null)count++;
        }
        System.out.println();
        System.out.println("��ϿϷ�");
        System.out.println(count + "�ڸ��� ���ҽ��ϴ�.");
    }//insertMember()�Է�
	
	public void list() {
		System.out.println();
		int i;
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		
		for(i=0;i<md.length;i++) {
			if(md[i]!=null) {
			System.out.println(md[i].getName()+"\t"+md[i].getAge()+"\t"+
								md[i].getPhoneNum()+"\t"+md[i].getAddress());
			}
		}	
	}//list()���
	
	public void updateMember() throws IOException {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
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
			System.out.println("ã�����ϴ� ȸ���� �����ϴ�.");
			return;
		}
		System.out.println(md[i].getName()+"\t"+md[i].getAge()+"\t"+
				md[i].getPhoneNum()+"\t"+md[i].getAddress());
		
		System.out.print("������ �̸� �Է� : ");
        name = br.readLine();
        System.out.print("������ ���� �Է� : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("������ �ڵ��� �Է� : ");
        phoneNum = br.readLine();
        System.out.print("������ �ּ� �Է� : ");
        address = br.readLine();
        md[i].setName(name);
        md[i].setAge(age);
        md[i].setPhoneNum(phoneNum);
        md[i].setAddress(address);
        System.out.print("\n�����Ϸ�\n");
	}//����
	
	public void deleteMember() throws IOException {
		int i;
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String deletePhoneNum = br.readLine();
		
		for(i=0;i<md.length;i++) {
			if(md[i]!=null) {
				if(md[i].getPhoneNum().equals(deletePhoneNum)) {
			        break;
				}
			}//if
		}//for
		if(i==md.length) {
			System.out.println("ã�����ϴ� ȸ���� �����ϴ�.");
			return;
		}
		md[i]=null;
		System.out.println("Ż��Ϸ�");
		
	}//Ż��
	
}
