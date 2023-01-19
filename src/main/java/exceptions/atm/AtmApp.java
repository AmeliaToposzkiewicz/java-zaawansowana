package exceptions.atm;

public class AtmApp {
    private static final Atm ATM = new Atm(1000d);

    public static void main(String[] args) {
        handleWithdraw(2000d);
        handleMakeDeposit(15000d);
    }

    public static void handleWithdraw(Double amount) {
        try {
            ATM.withdraw(amount);
        } catch (OutOfMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void handleMakeDeposit(Double amount) {
        try {
            ATM.makeDeposit(amount);
        } catch (TooMuchMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
