package ru.vet.cms.domain.enums;

public enum PetState {

    HEALTHY("HEALTHY", "1", "Здоров"),
    SUPERVISION("SUPERVISION", "2", "Под наблюдением"),
    CRITICAL("CRITICAL", "3", "Критическое"),
    UNKNOWN("UNKNOWN", "0", "Неизвестно");

    private String record;
    private String code;
    private String description;

    PetState(String record, String code, String description) {
        this.record = record;
        this.code = code;
        this.description = description;
    }
}
