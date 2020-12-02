package ru.vet.cms.domain.enums;

public enum Sex {

    MALE("MALE", "1", "Самец"),
    FEMALE("FEMALE", "2", "Самка"),
    UNKNOWN("UNKNOWN", "0", "Неизвестно");

    private String record;
    private String code;
    private String description;

    Sex(String record, String code, String description) {
        this.record = record;
        this.code = code;
        this.description = description;
    }
}
