package class_;

public class StaticMain {
   private int a;//�ʵ�, �ν��Ͻ�����
   private static int b;//�ʵ�, Ŭ��������
   
   static {
	   //static �ʱ�ȭ ����
	   System.out.println("static �ʱ�ȭ ����");
	   b=3;
   }
   
   public StaticMain(){
      System.out.println("�⺻ ������");
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
	   //System.out.println("a=" +this.a + "\t b=" + StaticMain.b); //����ƽ �����ȿ��� this.���� ����.
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

      //static �޼ҵ� ȣ��
      StaticMain.output();//Ŭ������.�޼ҵ�()
      output();
      st.output();//��ü.�޼ҵ�
      
      
   }

}//class StaticMain





