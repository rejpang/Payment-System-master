package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class LiabilityDetail extends BaseEntity {

    private String name;
    private BigDecimal obligation;
    private BigDecimal netAmount;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;

}
