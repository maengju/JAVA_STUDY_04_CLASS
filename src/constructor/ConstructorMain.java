package constructor;


class ConstructorTest{//생성자는 클래스명과 똑같아 대소문자까지
	String name=null;
	int age=0;
	
	
	//생성자 Overload
	public  ConstructorTest() { //생성자에선 절대로 리턴자를 넣을수없다.
		
		System.out.println("default 생성자");
		System.out.println("this = " + this); //this는 생성자의 주소값을 가지고 있다.
	}//생성자
	public ConstructorTest(String name) {
		this();
		this.name = name;
		System.out.println("this = " + this);
	}
	public ConstructorTest(int age) {
		this("코난");//Overload된 다른 생성자 호출(호출시엔 항상 첫줄에)
		this.age = age;
		System.out.println("this = " + this);
		
	}
	
}




//==========================================================================
public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest();//생성자는 직접적인 강제호출불가,그러나 new로클래스로 호출하면서 쓰거나 
													// 생성자끼리는 호출가능
		System.out.printf("이름 = %s \t 나이 = %d\n",aa.name,aa.age);
		System.out.println("aa"+aa);
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.printf("이름 = %s \t 나이 = %d\n",bb.name,bb.age);
		System.out.println("bb"+bb);
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(93);
		System.out.printf("이름 = %s \t 나이 = %d\n",cc.name,cc.age);
		System.out.println("cc"+cc);
		System.out.println();
	}

}