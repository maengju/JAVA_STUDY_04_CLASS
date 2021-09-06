package class_;

import java.util.Scanner;

public class StringBufferMain {
	private int dan,i,j;
	Scanner scan = new Scanner(System.in);
	
	public StringBufferMain(){
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();
		
	}
	public void Display() {
		StringBuffer buffer = new StringBuffer(); 
		for(i=1;i<10;i++) {
			j=dan*i;
			//System.out.println(dan+" * "+i+" = "+j);
			
			buffer.append(dan);//맨뒤에 추가시켜주는 append
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			System.out.println(buffer.toString()); //StringBuffer -> String 변환
			buffer.delete(0,buffer.length());
		}
	}
	
	public static void main(String[] args) {
		
		StringBufferMain sbm = new StringBufferMain();

		sbm.Display();
		
	}

}
