package files;

import Objects.Friend;

public class StaticKeyWord {
    // static = modifier. A single copy of a variable/method is created and shared.
	//			The class "owns" the static member
    
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        //Static key world can be used in function oriented programing. Usually it's not so used in OOP
        Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Patrick");
		
		System.out.println(Friend.numberOfFriends);
    }
}
