package constructor;

public class PointMain {
	private int x,y;
	
	//기본생성자를 잡아서 x=10,y10...
	
	public PointMain() {
		x=y=10;
	}
	
	public PointMain(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public PointMain(PointMain aa, PointMain bb) {
		this.x = aa.x+bb.x;
		this.y = aa.y*bb.y;
	}
	public void calcPlus() {
		x+=10;
	}
	public void calcPlus(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public static void main(String[] args) {
		PointMain aa = new PointMain();
		System.out.printf("x = %d y = %d\n",aa.x,aa.y);
		
		System.out.println("\nx의 값을 +10 증가하는 메소드를 작성하시요 -calcPlus()");
		aa.calcPlus();
		System.out.printf("x = %d y = %d\n",aa.x,aa.y);
		System.out.println();
		
		PointMain bb = new PointMain(100,200);
		System.out.printf("x = %d y = %d\n",bb.x,bb.y);
		
		System.out.println("\n3,-8을 인수로 받아서 x는중가y는 감소하는 메소드를 작성 calcPlus()");
		bb.calcPlus(3, -8);
		System.out.printf("x = %d y = %d\n",bb.x,bb.y);
		System.out.println();
		
		System.out.println("x는 aa의 x값과 bb의 x의 값을 더하고 y끼리는 곱하기");
		
		PointMain cc = new PointMain(aa,bb); //참조변수
		System.out.printf("x = %d y = %d\n",cc.x,cc.y);
		System.out.println();
	}

}
