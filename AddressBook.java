import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> abList;
	
	public AddressBook()
	{
		abList = new ArrayList<BuddyInfo>();

	}
	public static void main(String[] args) 
	{
		System.out.println("Address Book");
		AddressBook ab = new AddressBook();
		BuddyInfo bud = new BuddyInfo("Nome", "123 Address", "967-1111");
		ab.addBuddy(bud);
		ab.removeBuddy(0);
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
