/*
Ŭ����  : Compute
�ʵ�   : x, y, sum, sub, mul, div
setter : setX, setY
���   : calc() - ��, ��, ��, ��
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
	
		public void setX(int a) {//����
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
