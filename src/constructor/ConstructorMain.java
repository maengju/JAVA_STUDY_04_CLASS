package constructor;


class ConstructorTest{//�����ڴ� Ŭ������� �Ȱ��� ��ҹ��ڱ���
	String name=null;
	int age=0;
	
	
	//������ Overload
	public  ConstructorTest() { //�����ڿ��� ����� �����ڸ� ����������.
		
		System.out.println("default ������");
		System.out.println("this = " + this); //this�� �������� �ּҰ��� ������ �ִ�.
	}//������
	public ConstructorTest(String name) {
		this();
		this.name = name;
		System.out.println("this = " + this);
	}
	public ConstructorTest(int age) {
		this("�ڳ�");//Overload�� �ٸ� ������ ȣ��(ȣ��ÿ� �׻� ù�ٿ�)
		this.age = age;
		System.out.println("this = " + this);
		
	}
	
}




//==========================================================================
public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest();//�����ڴ� �������� ����ȣ��Ұ�,�׷��� new��Ŭ������ ȣ���ϸ鼭 ���ų� 
													// �����ڳ����� ȣ�Ⱑ��
		System.out.printf("�̸� = %s \t ���� = %d\n",aa.name,aa.age);
		System.out.println("aa"+aa);
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("ȫ�浿");
		System.out.printf("�̸� = %s \t ���� = %d\n",bb.name,bb.age);
		System.out.println("bb"+bb);
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(93);
		System.out.printf("�̸� = %s \t ���� = %d\n",cc.name,cc.age);
		System.out.println("cc"+cc);
		System.out.println();
	}

}