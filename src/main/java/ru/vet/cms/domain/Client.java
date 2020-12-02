package ru.vet.cms.domain;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@Table(name = "vetclinic_clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_info_id", referencedColumnName = "id", nullable = false)
    private PersonalInfo personalInfo;

    @OneToMany(mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

//    @OneToMany(mappedBy = "client")
//    private Set<Appointment> appointments = new HashSet<>();
}
