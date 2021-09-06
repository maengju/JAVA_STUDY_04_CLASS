package constructor;

public class PointMain {
	private int x,y;
	
	//�⺻�����ڸ� ��Ƽ� x=10,y10...
	
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
		
		System.out.println("\nx�� ���� +10 �����ϴ� �޼ҵ带 �ۼ��Ͻÿ� -calcPlus()");
		aa.calcPlus();
		System.out.printf("x = %d y = %d\n",aa.x,aa.y);
		System.out.println();
		
		PointMain bb = new PointMain(100,200);
		System.out.printf("x = %d y = %d\n",bb.x,bb.y);
		
		System.out.println("\n3,-8�� �μ��� �޾Ƽ� x���߰�y�� �����ϴ� �޼ҵ带 �ۼ� calcPlus()");
		bb.calcPlus(3, -8);
		System.out.printf("x = %d y = %d\n",bb.x,bb.y);
		System.out.println();
		
		System.out.println("x�� aa�� x���� bb�� x�� ���� ���ϰ� y������ ���ϱ�");
		
		PointMain cc = new PointMain(aa,bb); //��������
		System.out.printf("x = %d y = %d\n",cc.x,cc.y);
		System.out.println();
	}

}
