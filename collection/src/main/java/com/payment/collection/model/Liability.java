package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class Liability extends BaseEntity implements Serializable {

    @OneToOne
    private LiabilityDetail liabilityDetail;

}
