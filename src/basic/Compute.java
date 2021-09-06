/*
클래스  : Compute
필드   : x, y, sum, sub, mul, div
setter : setX, setY
계산   : calc() - 합, 차, 곱, 몫
getter : getX, getY, getSum, getSub, getMul, getDiv
 */

package basic;

public class Compute {

	
		private int x;
		private int y;
		private int sum;
		private int sub;
		private int mul;
		private double div;
	
		public void setX(int a) {//구현
			this.x=a;
		}
		public void setY(int a) {
			this.y=a;
		}
		public void calc() {
			sum = x+y;
			sub = x-y;
			mul = x*y;
			div = (double)x/y;
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		
		public int getSum() {
			return sum;
		}
		public int getSub() {
			return sub;
		}
		public int getMul() {
			return mul;
		}
		public double getDiv() {
			return div;
		}
		
		

}
