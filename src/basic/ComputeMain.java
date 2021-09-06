/*
x=320, y=258로 합, 차, 곱, 몫을 구하시오

[실행결과]
x     y      sum   sub    mul    div
320   258    xxx
 */

package basic;

public class ComputeMain {

	public static void main(String[] args) {
		System.out.println("X\tY\tsum\tsub\tmul\tdiv");
		Compute c = new Compute();
		c.setX(320);
		c.setY(258);		
		c.calc();		
		System.out.println(c.getX()+"\t"+c.getY()+"\t"+c.getSum()+"\t"+c.getSub()+"\t"+c.getMul()+"\t"+c.getDiv());
		
		Compute c1 = new Compute();
		c1.setX(236);
		c1.setY(125);		
		c1.calc();		
		System.out.println(c1.getX()+"\t"+c1.getY()+"\t"+c1.getSum()+"\t"+c1.getSub()+"\t"+c1.getMul()+"\t"+c1.getDiv());
		
		Compute c2 = new Compute();
		c2.setX(539);
		c2.setY(327);		
		c2.calc();		
		System.out.println(c2.getX()+"\t"+c2.getY()+"\t"+c2.getSum()+"\t"+c2.getSub()+"\t"+c2.getMul()+"\t"+c2.getDiv());


	}

}
