/*
ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ� - indexOf(), replace()
String Ŭ������ �޼ҵ带 �̿��Ͻÿ�
��ҹ��� ������� ������ ����Ͻÿ�

[������]
���ڿ� �Է� : aabba
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ
----------------
���ڿ� �Է� : aAbbA
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ
----------------
���ڿ� �Է� : aabbaa
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbbdd
2�� ġȯ
----------------
���ڿ� �Է� : AAccaabbaaaaatt
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddccddbbddddatt
4�� ġȯ
----------------
���ڿ� �Է� : aabb
���� ���ڿ� �Է� : aaaaa
�ٲ� ���ڿ� �Է� : ddddd
�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�
ġȯ �� �� �����ϴ�
 */
 



package class_;
import java.util.Scanner;
public class StringMain2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count=0,index=0,i;
		String str,present,change;
		
		System.out.print("���ڿ� �Է� : ");
		str = scan.next();
		
		str=str.toLowerCase();   //���ڿ� �ҹ��ڷ� ��ȯ
		
		
		System.out.print("���� ���ڿ� �Է� : ");
		present = scan.next();
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		change = scan.next();
		
		if(str.length()<present.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
		}else {
			while((index=str.indexOf(present,index))!=-1) {
				count++;
				index+= present.length();
			}//while
			
		
			str= str.replace(present, change);
			System.out.println(str);
			System.out.println(count+"���� ġȯ�߽��ϴ�.");
		}
	}//����

}
