package examples;

public class MemberDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlatinumMembership pm=new PlatinumMembership();
		pm.memberName="Member1";
		pm.memberID="#1025";
		pm.price=1600;
		pm.getMemberInfo();
		System.out.println("Member Price: "+pm.memberPrice());
		
		GoldMembership gm=new GoldMembership();
		gm.memberName="Member2";
		gm.memberID="#1026";
		gm.price=1600;
		gm.getMemberInfo();
		System.out.println("Member Price: "+gm.memberPrice());
		
		SilverMembership sm=new SilverMembership();
		sm.memberName="Member3";
		sm.memberID="#1027";
		sm.price=1600;
		sm.getMemberInfo();
		System.out.println("Member Price: "+sm.memberPrice());
	}

}

class Membership{
	public String memberName;
	protected String memberID;
	public float price;
	
	public void getMemberInfo(){
		System.out.println("Name: "+this.memberName+"     ID: "+this.memberID);
	}
	
	public float memberPrice(){
		return price;
	}
}

class PlatinumMembership extends Membership{
	public float memberPrice(){
		float memberPrice=price*0.5f;
		return memberPrice;
	}
}

class GoldMembership extends Membership{
	public float memberPrice(){
		float memberPrice=price*0.7f;
		return memberPrice;
	}
}

class SilverMembership extends Membership{
	public float memberPrice(){
		float memberPrice=price*0.9f;
		return memberPrice;
	}
}
