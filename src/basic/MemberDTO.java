package basic;

public class MemberDTO {
	private int age;
    private String name;
    private String phoneNum;
    private String address;

    public void setName(String name) {
        this.name = name; //this.Ŭ���� �ǰ����� �˷��ִ°�.(�򰥸���� ���)
    }
    public String getName() {
        return name;
     } //�̸�
    
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }//����
    
    
  public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }//��ȭ��ȣ
    
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }//�ּ�
}
