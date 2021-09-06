package constructor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryService {
	private int empld,basePay,benefit,salary;
	private double taxRate,tax;
	private String name,position;
	private SalaryDTO[] ar;
	
	public SalaryService(SalaryDTO[] ar) {//ar 방배열을 받은것이아니라 주소를 받은것
		this.ar = ar;
	}
	
	DecimalFormat df = new DecimalFormat();
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		int num;
		while(true) {
			System.out.println("***********");
			System.out.println("1.사원 등록");
			System.out.println("2.전체 출력");
			System.out.println("3.사원 정보 수정");
			System.out.println("4.퇴사 ");
			System.out.println("5.종료 ");
			System.out.println("***********");
			System.out.print("번호 : ");
			num = scan.nextInt();
			if(num==5)break;
			if(num==1)insertEmp();	
			else if(num==2)display();
			else if(num==3)updateEmp();
			else if(num==4)deleteEmp();
		}//while
	}//menu()
	
	public void insertEmp() {
		int i;
		
		for(i=0;i<ar.length; i++) {
			if(ar[i]==null) break;
		}
		if(i==ar.length) {
			System.out.println("정원초과");
			return;
		}
		
		System.out.print("사원번호 입력 : ");
		empld = scan.nextInt();
		System.out.print("사원명 입력 : ");
		name = scan.next();
		System.out.print("직급 입력 : ");
		position = scan.next();
		System.out.print("기본급 입력 : ");
		basePay = scan.nextInt();
		System.out.print("수당 입력 : ");
		benefit = scan.nextInt();
		
		ar[i] = new SalaryDTO(empld,name,position,basePay,benefit);
		ar[i].calcSalary();
		System.out.println("등록완료");
		
	}//insert
	
	
	public void display() {
		System.out.println();
		int i;
		System.out.println("사원 번호\t이름\t직급\t기본급\t\t수당\t  세율\t세금\t월급");
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				
				System.out.println("  "+ar[i].getEmpld()+"\t"+
										ar[i].getName()+"\t"+ar[i].getPosition()
									+"\t"+df.format(ar[i].getBasePay())+
									"\t"+df.format(ar[i].getBenefit())+
									"\t  "+String.format("%.0f",(ar[i].getTaxRate()*100))+"%"
									+"\t"+df.format(ar[i].getTax())+
									"\t"+df.format(ar[i].getSalary()));
			}
		}
	}//list
	
	public void updateEmp() {
		System.out.print("사원 번호 입력 : ");
		int updateNum = scan.nextInt();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i].getEmpld()==updateNum) {
				break;
			}//if
		
		}//for
		
		if(i==ar.length) {
			System.out.println("찾고자하는 사원이 없습니다.");
			return;
		}
		System.out.println("사원 번호\t이름\t직급\t기본급\t\t수당\t  세율\t세금\t월급");
		System.out.println("  "+ar[i].getEmpld()+"\t"+ar[i].getName()+"\t"+ar[i].getPosition()
				+"\t"+df.format(ar[i].getBasePay())+"\t"+df.format(ar[i].getBenefit())+
				"\t  "+String.format("%.0f",(ar[i].getTaxRate()*100))+"%"
				+"\t"+df.format(ar[i].getTax())+"\t"+df.format(ar[i].getSalary()));
		
		System.out.println();
		System.out.print("수정할 사원명 입력 : ");
		ar[i].setName(scan.next());
		System.out.print("수정할 직급 입력 : ");
		ar[i].setPosition(scan.next());
		System.out.print("수정할 기본급 입력 : ");
		ar[i].setBasePay(scan.nextInt());
		System.out.print("수정할 수당 입력 : ");	
		ar[i].setBenefit(scan.nextInt());
		ar[i].calcSalary();
		System.out.println("수정 완료");
	}//update

	public void deleteEmp() {
		System.out.print("사원 번호 입력 : ");
		int updateNum = scan.nextInt();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i].getEmpld()==updateNum) {
				break;
			}//if
		}//for
		
		if(i==ar.length) {
			System.out.println("찾고자하는 사원이 없습니다.");
			return;
		}
		ar[i]=null;
		System.out.println("삭제완료");
	}//delete
}
