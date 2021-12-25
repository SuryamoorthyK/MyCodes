package week1.day1;

public class Mobile {
	
			String mobileModel = "Samsung Galaxy M32";
			int mobileWeight = 150 ;
			boolean isFullCharge = true;
			double mobileCost =  14999.99;
			

	public void makeCall() { 
	System.out.println("Call Connected");
	}
	    
	public void sendMsg() {
		System.out.println("Message sent");
	}
	public static void main(String[] args)	{
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}
	
}
