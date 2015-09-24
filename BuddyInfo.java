
public class BuddyInfo extends AddressBook {
	
	private String bName;
	private String bAddy;
	private String bPhone;
	
	public BuddyInfo(String bName, String bAddy, String bPhone)
	{
		super();
		this.bName = bName;
		this.bAddy = bAddy;
		this.bPhone = bPhone;
	}
	public static void main(String[] args) {

		System.out.println("Hello!");
		BuddyInfo bi = new BuddyInfo();
		bi.setbName("Tommy");
		bi.setbPhone("867-5309");
		System.out.println(bi.bName+" "+bi.bPhone);
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAddy() {
		return bAddy;
	}

	public void setbAddy(String bAddy) {
		this.bAddy = bAddy;
	}

	public String getbPhone() {
		return bPhone;
	}

	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
	

}
