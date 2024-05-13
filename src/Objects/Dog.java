package Objects;

public class Dog extends Animal{
    @Override
	public void speak() {
		System.out.println("The dog goes *bark*");
	}
	@Override
	public void animalSpeak(){
		System.out.println("*bark*");	
	}
}
