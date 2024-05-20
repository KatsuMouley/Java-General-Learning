package Objects;

public class Cat extends Animal {
    @Override
    public void speak(){
        System.out.println("Cat goes MEOW MEOW MEOW MEOOOOOOOOOOOOOW");
    }
	@Override
	public void animalSpeak(){
		System.out.println("*meow*");	
	}
}
