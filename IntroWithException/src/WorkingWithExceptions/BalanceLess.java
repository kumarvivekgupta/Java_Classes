package WorkingWithExceptions;

public class BalanceLess extends Throwable {
    public String reason;

    public void condition(String reason) {
        this.reason = reason;
    }
}
