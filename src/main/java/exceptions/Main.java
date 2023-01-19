package exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            throwException();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    private static void throwException() {// moze byc przed { throws RuntimeException
        throw new RuntimeException("Błąd");
    }
}
