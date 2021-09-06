package basic;

public class MemberDTO {
	private int age;
    private String name;
    private String phoneNum;
    private String address;

    public void setName(String name) {
        this.name = name; //this.클래스 의것임을 알려주는것.(헷갈릴경우 사용)
    }
    public String getName() {
        return name;
     } //이름
    
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }//나이
    
    
  public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }//전화번호
    
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }//주소
}
