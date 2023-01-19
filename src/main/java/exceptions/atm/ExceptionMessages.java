package exceptions.atm;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    NOT_ENOUGH_MONEY_IN_ATM("W bankomacie jest za mało pieniędzy, maksymalnie można wypłacić: %s"),
    TOO_MUCH_MONEY_IN_ATM("Przekroczono pojemność bakomatu, maksymalnie można wpłacić: %s");
    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

}
