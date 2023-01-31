package oop.showroom.exceptions;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    OBJECT_CANT_BE_NULL("E-000001", "Obiekt nie może mieć wartości null"),
    OBJECT_NOT_FOUND_BY_PROVIDED_ID("E-000002", "Nie znaloziono obiektu o podanym id");

    private final String code;
    private final String message;

    ExceptionMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
