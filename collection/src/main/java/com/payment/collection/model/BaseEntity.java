package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class BaseEntity implements Serializable {

    @Id
    private Long id;

}
