package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Customer implements Serializable {

    @Id
    private Long customerId;
    private String name;
    private BigDecimal balance;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Liability> liabilityList;

}
