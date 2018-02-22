package WorkingWithExceptions;

public class Demo {

    public static void main(String[] args) {

        SmsSender s1 = new SmsSender();
        s1.balance = 19;
        try {
            s1.sendOTP("1234567890", "5432");
        } catch (InvalidNumber invalidNumber) {
            invalidNumber.checkNum("not correct number");
            System.out.println(invalidNumber.reason);
        } catch (BalanceLess balanceLess) {
            System.out.println(balanceLess.reason);
        }
    }
}


//take u are making an Sms sender function in a bank site


//it can be called by different sections then if has done work successfully then no issue but if it failed then u have
//throw exception to the responsible section