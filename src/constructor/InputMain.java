package constructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMain {
	private int x;
	private double y;
	
	public InputMain() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("data.txt")); ���Ϸ� �Է¹޴¹��
		
		System.out.print("���� �Է� : ");
		x = scan.nextInt();
		System.out.print("�Ǽ� �Է� : ");
		y = scan.nextDouble();
	}
	
	
	public void output() {
		System.out.printf("x = "+x+"\t y = "+y);
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		InputMain aa = new InputMain();
		aa.output();

	}

}
