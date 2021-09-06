package constructor;

public class SalaryDTO {
	private int empld,basePay,benefit,salary;
	private double taxRate,tax;
	private String name,position;
	
	public SalaryDTO(int empld,String name,String position,int basePay,int benefit) {
		this.empld=empld;
		this.name=name;
		this.position=position;
		this.basePay=basePay;
		this.benefit=benefit;
	}
	
	public void calcSalary() {
		if((basePay+benefit)<=2000000) {
			taxRate=0.01;
		}else if ((basePay+benefit)<=4000000) {
			taxRate=0.02;
		}else taxRate=0.03;
		
		tax=(basePay+benefit)*taxRate;
		salary = (basePay+benefit)-(int)tax;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setBasePay(int basePay) {
		this.basePay=basePay;
	}
	public void setBenefit(int benefit) {
		this.benefit=benefit;
	}
	public int getEmpld() {
		return empld;
	}
	public int getBasePay() {
		return basePay;
	}
	public int getBenefit() {
		return benefit;
	}
	public int getSalary() {
		return salary;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public int getTax() {
		return (int)tax;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	
	
	
	
	
	
}
