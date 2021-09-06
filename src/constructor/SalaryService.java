package constructor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryService {
	private int empld,basePay,benefit,salary;
	private double taxRate,tax;
	private String name,position;
	private SalaryDTO[] ar;
	
	public SalaryService(SalaryDTO[] ar) {//ar ��迭�� �������̾ƴ϶� �ּҸ� ������
		this.ar = ar;
	}
	
	DecimalFormat df = new DecimalFormat();
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		int num;
		while(true) {
			System.out.println("***********");
			System.out.println("1.��� ���");
			System.out.println("2.��ü ���");
			System.out.println("3.��� ���� ����");
			System.out.println("4.��� ");
			System.out.println("5.���� ");
			System.out.println("***********");
			System.out.print("��ȣ : ");
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
			System.out.println("�����ʰ�");
			return;
		}
		
		System.out.print("�����ȣ �Է� : ");
		empld = scan.nextInt();
		System.out.print("����� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		position = scan.next();
		System.out.print("�⺻�� �Է� : ");
		basePay = scan.nextInt();
		System.out.print("���� �Է� : ");
		benefit = scan.nextInt();
		
		ar[i] = new SalaryDTO(empld,name,position,basePay,benefit);
		ar[i].calcSalary();
		System.out.println("��ϿϷ�");
		
	}//insert
	
	
	public void display() {
		System.out.println();
		int i;
		System.out.println("��� ��ȣ\t�̸�\t����\t�⺻��\t\t����\t  ����\t����\t����");
		
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
		System.out.print("��� ��ȣ �Է� : ");
		int updateNum = scan.nextInt();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i].getEmpld()==updateNum) {
				break;
			}//if
		
		}//for
		
		if(i==ar.length) {
			System.out.println("ã�����ϴ� ����� �����ϴ�.");
			return;
		}
		System.out.println("��� ��ȣ\t�̸�\t����\t�⺻��\t\t����\t  ����\t����\t����");
		System.out.println("  "+ar[i].getEmpld()+"\t"+ar[i].getName()+"\t"+ar[i].getPosition()
				+"\t"+df.format(ar[i].getBasePay())+"\t"+df.format(ar[i].getBenefit())+
				"\t  "+String.format("%.0f",(ar[i].getTaxRate()*100))+"%"
				+"\t"+df.format(ar[i].getTax())+"\t"+df.format(ar[i].getSalary()));
		
		System.out.println();
		System.out.print("������ ����� �Է� : ");
		ar[i].setName(scan.next());
		System.out.print("������ ���� �Է� : ");
		ar[i].setPosition(scan.next());
		System.out.print("������ �⺻�� �Է� : ");
		ar[i].setBasePay(scan.nextInt());
		System.out.print("������ ���� �Է� : ");	
		ar[i].setBenefit(scan.nextInt());
		ar[i].calcSalary();
		System.out.println("���� �Ϸ�");
	}//update

	public void deleteEmp() {
		System.out.print("��� ��ȣ �Է� : ");
		int updateNum = scan.nextInt();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i].getEmpld()==updateNum) {
				break;
			}//if
		}//for
		
		if(i==ar.length) {
			System.out.println("ã�����ϴ� ����� �����ϴ�.");
			return;
		}
		ar[i]=null;
		System.out.println("�����Ϸ�");
	}//delete
}
