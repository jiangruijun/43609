package examples;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s1=new Staff("Staff1",6000);
		Staff s2=new Staff("Staff2",8000);
		s1.getPayroll();
		s2.getPayroll();		
	}

}

class Staff{
	public String staffName;
	private float salary;
	
	public Staff(String staffName,float salary){
		this.staffName=staffName;
		this.salary=salary;
	}

	public float getSalary() {
		return salary;
	}
	
	public void getPayroll(){
		System.out.println("Name: "+this.staffName+"     Payment: "+getSalary());
	}	
}
