/*
1사분기의 과일별 합계와 월별 합계를 구하시오

클래스 : FruitTest
필드  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar
       
메소드 : 생성자
       calcTot()
       display()
       output() - 월별 출력  

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75        255
포도     30    25    10        xxx
딸기     25    30    90        xxx
---------------------------------
        xxx   xxx   xxx
 */

package class_;

public class FruitMain {

	public static void main(String[] args) {
			
		FruitTest[] ar = { new FruitTest("사과",100,80,75),
					new FruitTest("포도",30,25,10),
					new FruitTest("딸기",25,30,90)
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
