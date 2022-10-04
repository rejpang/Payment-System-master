package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class Liability implements Serializable {

    @Id
    private Long liabilityId;

    @OneToOne(cascade = CascadeType.ALL)
    private LiabilityDetail liabilityDetail;

}
