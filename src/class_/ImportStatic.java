package class_;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*;   // * : 와일드 카드(모든것)
import static java.lang.System.out;
import java.util.Random;

public class ImportStatic {

	public static void main(String[] args) {

		System.out.println("난수는 = "+random());

		
		Random r = new Random();
		out.println("난수 = "+r.nextDouble()); // 0<=난수<1
		out.println("정수형 난수 = "+r.nextInt());
		out.println("정수형 난수 = "+(r.nextInt(100)+1));//1~100
		
		out.println("2의 5승 = "+pow(2, 5));
	}

}
