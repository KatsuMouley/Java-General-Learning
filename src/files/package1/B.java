package files.package1;

public class B {
    private String privateMessage = "This is a private message";
    private String differentMessage;
    // private: visible only in the same class
    public B(){}
    public B(String differentMessage){
        setDifferentMessage(differentMessage);
    }

    public String getDifferentMessage() {
        return differentMessage;
    }
    public void setDifferentMessage(String differentMessage) {
        this.differentMessage = differentMessage;
    }
    public String getPrivateMessage() {
        return privateMessage;
    }
}
