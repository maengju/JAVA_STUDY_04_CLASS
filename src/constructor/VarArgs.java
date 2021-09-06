package constructor;

public class VarArgs {
	
	public int sum(int...ar) {//���������� �迭�� ó��
		int hab=0;
		for(int i = 0; i<ar.length; i++) {
			hab+= ar[i];
		}
		return hab;
	}
	
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public int sum(int a, int b , int c,int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("�� = "+ va.sum(10,20));
		System.out.println("�� = "+ va.sum(10,20,30));
		System.out.println("�� = "+ va.sum(10,20,30,40));

	}

}
