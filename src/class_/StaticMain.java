package class_;

public class StaticMain {
   private int a;//필드, 인스턴스변수
   private static int b;//필드, 클래스변수
   
   static {
	   //static 초기화 영역
	   System.out.println("static 초기화 영역");
	   b=3;
   }
   
   public StaticMain(){
      System.out.println("기본 생성자");
      a=3;
   }
   
   public void calc(){
      a++;
      b++;
   }

   public void disp(){
      System.out.println("a=" +this.a + "\t b=" + StaticMain.b);
   }
   
   public static void output() {
	   System.out.println("static method....");   
	   //System.out.println("a=" +this.a + "\t b=" + StaticMain.b); //스테틱 영역안에는 this.값이 없다.
   }

  

   public static void main(String[] args) {
      StaticMain st = new StaticMain();
      st.calc();
      st.disp();
      System.out.println();
      
      StaticMain st2 = new StaticMain();
      st2.calc();
      st2.disp();
      System.out.println();
      
      StaticMain st3 = new StaticMain();
      st3.calc();
      st3.disp();
      System.out.println();

      //static 메소드 호출
      StaticMain.output();//클래스명.메소드()
      output();
      st.output();//객체.메소드
      
      
   }

}//class StaticMain





