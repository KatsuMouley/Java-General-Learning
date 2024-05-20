package Objects;

public class SubObject extends Object {
    

    private String privateName;
    private int privateAge;
    //Constructors
    public SubObject(String privateName, int privateAge){
        setPrivateName(privateName);
        setPrivateAge(privateAge);
    }
    public SubObject(SubObject carX) {
        this.setPrivateAge(carX.getPrivateAge());
        this.setPrivateName(carX.getPrivateName());
    }
    //overides
    @Override
    public String toString()
    {
        // String myString = name+'\n'+health+'\n'+favFood+'\n'+age+'\n'+money+'\n';
        return this.privateName + "\n" + this.privateAge;
    }
    //Getters and Setters
    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public int getPrivateAge() {
        return privateAge;
    }

    public void setPrivateAge(int privateAge) {
        this.privateAge = privateAge;
    }
    //Copy method
    public void copy(SubObject carX) {
        this.setPrivateAge(carX.getPrivateAge());
        this.setPrivateName(carX.getPrivateName());
    }
}
