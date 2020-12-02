package ru.vet.cms.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Getter @Setter
//@Table(name = "vetclinic_vets")
public class Vet {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "personal_info_id", referencedColumnName = "id", nullable = false)
//    private PersonalInfo personalInfo;
//
//    @Column(name = "salary", nullable = false)
//    private Integer salary;
//
//    @Column(name = "bonus", nullable = false)
//    private Integer bonus;
//
//    @OneToMany(mappedBy = "vet")
//    private Set<Appointment> appointments = new HashSet<>();
}
