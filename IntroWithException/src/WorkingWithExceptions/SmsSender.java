package WorkingWithExceptions;

public class SmsSender {
    int balance = 100;

    //balance function is to be called to initialize the balance
    public int sendOTP(String no, String otp) throws InvalidNumber, BalanceLess {
        if (no.length() < 10)
            throw new InvalidNumber();
        if (balance < 0) {
            BalanceLess n1 = new BalanceLess();
            n1.condition("Balance bharva le");
            throw n1;
        }
        System.out.println("All Good");
        return 0;
    }
}
