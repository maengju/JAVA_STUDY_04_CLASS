package basic;

public class SungJukMain {

   public static void main(String[] args) {
      SungJuk[] ar = new SungJuk[3];//��ü �迭 ����
      for(int i=0; i<ar.length; i++) {
         ar[i] = new SungJuk();
      }
         
      ar[0].setData("ȫ�浿", 90, 96, 100);//ȣ��
      ar[1].setData("���̾�", 100, 89, 75);//ȣ��
      ar[2].setData("����ġ", 75, 80, 48);//ȣ��
      
      System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
      for(SungJuk s : ar) {
         s.calcTot();
         s.calcAvg();
         s.calcGrade();
         System.out.println(s.getName()+"\t"
               + s.getKor()+"\t"
               + s.getEng()+"\t"
               + s.getMath()+"\t"
               + s.getTot()+"\t"
               + s.getAvg()+"\t"
               + s.getGrade());
      }//for
      
   }

}