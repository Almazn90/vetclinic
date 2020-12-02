package ru.vet.cms.domain;


import lombok.Getter;
import lombok.Setter;
import ru.vet.cms.domain.enums.ServiceType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Entity
//@Getter @Setter
//@Table(name = "vetclinic_services")
public class Service {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    @Getter @Setter
//    private long id;
//
//    @Column(name = "service_code", nullable = false, length = 3)
//    private Integer serviceCode;
//
//    @Column(name = "title", nullable = false)
//    private String title;
//
//    @Column(name = "description", nullable = false, length = 3000)
//    private String description;
//
//    @Column(name = "serive_type", nullable = false, length = 10)
//    private ServiceType SERVICETYPE;
//
//    @Column(name = "price", nullable = false, length = 10)
//    private Integer price;
//
//    @ManyToMany(mappedBy = "services")
//    private List<Appointment> appointments = new ArrayList<>();
}
