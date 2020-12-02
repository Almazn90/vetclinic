package ru.vet.cms.domain;

import lombok.Getter;
import lombok.Setter;
import ru.vet.cms.domain.enums.PetState;
import ru.vet.cms.domain.enums.PetType;
import ru.vet.cms.domain.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@Table(name = "vetclinic_pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "reg_Date", nullable = false)
    private LocalDate regDate;

    @Column(name = "last_visit_date", nullable = false)
    private LocalDate lastVisitDate;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Client owner;

    @Column(name = "pet_type", length = 10)
    private PetType petType;

    @Column(name = "pet_state", length = 10)
    private PetState petState;

    @Column(name = "pet_sex", length = 10)
    private Sex sex;

//    @OneToMany(mappedBy = "pet")
//    private Set<Appointment> appointments = new HashSet<>();
}
