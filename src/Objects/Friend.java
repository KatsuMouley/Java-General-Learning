package Objects;

public class Friend {


	public String name;
	
	public static int numberOfFriends;
	
	public Friend(String name){
		this.name=name;
		numberOfFriends++;
	}
}