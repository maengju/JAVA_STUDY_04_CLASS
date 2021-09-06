/*
1��б��� ���Ϻ� �հ�� ���� �հ踦 ���Ͻÿ�

Ŭ���� : FruitTest
�ʵ�  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar
       
�޼ҵ� : ������
       calcTot()
       display()
       output() - ���� ���  

[������]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
���    100    80    75        255
����     30    25    10        xxx
����     25    30    90        xxx
---------------------------------
        xxx   xxx   xxx
 */

package class_;

public class FruitMain {

	public static void main(String[] args) {
			
		FruitTest[] ar = { new FruitTest("���",100,80,75),
					new FruitTest("����",30,25,10),
					new FruitTest("����",25,30,90)
				};
		
		System.out.println("----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("----------------------------------");
		for(int i=0; i<ar.length;i++) {
			ar[i].calcTot();
			ar[i].display();
		}
		
		System.out.println("----------------------------------");
		FruitTest.output();
		
		
	}

}
