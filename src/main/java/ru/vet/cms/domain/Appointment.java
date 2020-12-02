package ru.vet.cms.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;
import ru.vet.cms.domain.enums.AppStatus;
import ru.vet.cms.domain.enums.PaymentStatus;

import javax.persistence.*;
import java.util.*;

//@Entity
//@Getter @Setter
//@Table(name = "vetclinic_appointment")
public class Appointment {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "admin_id", nullable = false)
//    private Admin admin;
//
//    @ManyToOne
//    @JoinColumn(name = "vet_id", nullable = false)
//    private Vet vet;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id", nullable = false)
//    private Client client;
//
//    @ManyToOne
//    @JoinColumn(name = "pet_id", nullable = false)
//    private Pet pet;
//
//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "Appointment_Service",
//            joinColumns = { @JoinColumn(name = "appointment_id")},
//            inverseJoinColumns = { @JoinColumn(name = "service_id")}
//    )
//    private List<Service> services = new ArrayList<>(); //TODO Какой список использовать?
//
//    @Column(name = "app_date")
//    private Date appDate;
//
//    @Column
//    private AppStatus appStatus;
//
//    @Column
//    private PaymentStatus paymentStatus;
}
