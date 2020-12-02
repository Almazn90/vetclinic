package ru.vet.cms.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@Table(name = "vetclinic_personal_info")
public class PersonalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    private long id;

    @Column(name = "reg_date", nullable = false)
    private LocalDate regDate;

    @Column(name = "last_visit_date", nullable = false)
    private LocalDate lastVisitDate;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "mid_name")
    private String midName;

    @Column(name = "phone_number", nullable = false, length = 12)
    private String phoneNumber;

    @Column(name = "reserve_phone_number", length = 12)
    private String revervePhoneNumber;

    @Column(name = "notes", length = 3000)
    private String notes;

//    @OneToOne(mappedBy = "personalInfo")
//    private Client client; //TODO попробовать удалить позже, на стадии создания БД, чтобы проверить, нужно ли вообще это поле
//
//    @OneToOne(mappedBy = "personalInfo")
//    private Admin admin;
//
//    @OneToOne(mappedBy = "personalInfo")
//    private Vet vet;
}
