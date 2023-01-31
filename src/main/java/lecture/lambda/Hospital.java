package lecture.lambda;

@FunctionalInterface
public interface Hospital {
    void treat();

    default String processDefault() {
        return "Hej!";
    }

    //nie moze tu byc wiecej niz jednej metody chyba ze default
}
