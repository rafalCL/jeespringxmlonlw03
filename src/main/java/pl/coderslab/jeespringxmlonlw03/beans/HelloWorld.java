package pl.coderslab.jeespringxmlonlw03.beans;

public class HelloWorld {
    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public HelloWorld setMessage(String message) {
        this.message = message;
        return this;
    }
}
