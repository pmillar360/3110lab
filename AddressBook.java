import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> abList;
	
	public static void main(String[] args) 
	{
		System.out.println("Address Book");
		abList = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo newBuddy)
	{
		if(newBuddy != null)
		{
			abList.add(newBuddy)
		}
		
	}
	
	public void removeBuddy(int index)
	{
		if(index >=0 && index < abList.size())
		{
			abList.remove(index);
		}
	}
}
