package com.payment.collection.model.temp;

import com.payment.collection.model.Liability;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TempCustomer {

    private Long id;
    private String name;
    private BigDecimal balance;

    private List<Liability> liabilityList;

}
