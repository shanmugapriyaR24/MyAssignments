package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Make Call");
		String mobileModel ="Samsung";
		float mobileWeight=152.2f;
	}
	public void  sendMsg() {
		System.out.println("sendMsg");
		boolean fullyCharged=true;
		int mobileCost=50000 ;
}

	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		
	System.out.println("This is my mobile");
			
	}

}
