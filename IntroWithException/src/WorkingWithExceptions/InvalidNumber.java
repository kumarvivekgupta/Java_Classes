package WorkingWithExceptions;

public class InvalidNumber extends Exception {
    String reason;

    public void checkNum(String reason) {
        this.reason = reason;


    }
}
