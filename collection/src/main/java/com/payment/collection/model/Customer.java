package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Customer extends BaseEntity implements Serializable {

    private String name;
    private BigDecimal balance;

    @OneToMany
    private List<Liability> liabilityList;

}
