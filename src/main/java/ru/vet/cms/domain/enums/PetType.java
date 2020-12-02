package ru.vet.cms.domain.enums;

public enum PetType {

    DOG("DOG", "1", "Собака"),
    CAT("CAT", "2", "Кошка"),
    RODENT("RODENT", "3", "Грызун"),
    BIRD("BIRD", "4", "Птица"),
    FOX("FOX", "5", "Лиса"),
    UNKNOWN("UNKNOWN", "0", "Неизвестно");

    private String record;
    private String code;
    private String description;

    PetType(String record, String code, String description) {
        this.record = record;
        this.code = code;
        this.description = description;
    }

}
