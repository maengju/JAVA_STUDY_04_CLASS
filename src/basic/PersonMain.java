package basic;

class Person{
	private String name; //private�� ���� Ŭ���� �ȿ����� ���� ���� 
	private int age;	//�ʵ�,�ʱ�ȭ
	
	public void setName(String n) {//����
		name = n;
	}
	public void setAge(int a) {//����
		age = a;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setData() {}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
}

//-----------------------------------------------------------------------


public class PersonMain {

	public static void main(String[] args) {
		Person p;//��ü
		p = new Person();//����
		System.out.println("��ü p = "+p);
		System.out.println("��ü p = "+p.toString());
		p.setName("ȫ�浿");// ȣ��
		p.setAge(25);
		System.out.println(" �̸� "+p.getName() +"\t ���� "+p.getAge());

		System.out.println();
		Person p2 = new Person();
		System.out.println("��ü p2 = "+p2);
		System.out.println("��ü p2 = "+p2.toString());
		
		p2.setName("�ڳ�");// ȣ��
		p2.setAge(13);
		System.out.println(" �̸� "+p2.getName() +"\t ���� "+p2.getAge());
		System.out.println();
		
		Person p3 = new Person();
		p3.setData("���̾�",35);
		System.out.println(" �̸� "+p3.getName() +"\t ���� "+p3.getAge());
		System.out.println();
		
		Person p4 = new Person();
		p4.setData();
		System.out.println(" �̸� "+p4.getName() +"\t ���� "+p4.getAge());
		System.out.println();
		

	}

}
