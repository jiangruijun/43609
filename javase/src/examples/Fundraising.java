package examples;

public class Fundraising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Donor d1=new Donor("John Doe",99.5f);
		System.out.println(+Donor.getTotalAmount());
		Donor d2=new Donor("Jane Doe",100);
		System.out.println(+Donor.getTotalAmount());
	}

}

class Donor{
	String donorName;
	float contribution;
	static float totalAmount=0;
	
	public Donor(String donorName,float contribution){
		this.donorName=donorName;
		this.contribution=contribution;
		totalAmount+=contribution;
	}
	
	public static float getTotalAmount(){
		return totalAmount;
	}
}
