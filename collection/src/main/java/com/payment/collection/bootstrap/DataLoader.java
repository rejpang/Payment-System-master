package com.payment.collection.bootstrap;

import com.payment.collection.model.Customer;
import com.payment.collection.model.Liability;
import com.payment.collection.model.LiabilityDetail;
import com.payment.collection.repo.CustomerRepository;
import com.payment.collection.repo.LiabilityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    private final LiabilityRepository liabilityRepository;
    private final CustomerRepository customerRepository;

    public DataLoader(LiabilityRepository liabilityRepository, CustomerRepository customerRepository){
        this.liabilityRepository = liabilityRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Liability liability = new Liability();
        Customer customer = new Customer();
        LiabilityDetail liabilityDetail = new LiabilityDetail();

        liability.setId(1L);
        customer.setId(1L);
        customer.setBalance(BigDecimal.valueOf(5000));
        customer.setName("Rex");

        liabilityDetail.setId(1L);
        liabilityDetail.setName("Meralco");
        liabilityDetail.setObligation(BigDecimal.valueOf(3000));
        liabilityDetail.setNetAmount(customer.getBalance().subtract(liabilityDetail.getObligation()));
        liabilityDetail.setCreatedBy("Rex");
        liabilityDetail.setUpdatedBy("Rex");
        liabilityDetail.setCreatedDate(simpleDateFormat.format(new Date()));
        liabilityDetail.setUpdatedDate(simpleDateFormat.format(new Date()));

        liability.setLiabilityDetail(liabilityDetail);
        customer.getLiabilityList().add(liability);
        customerRepository.save(customer);

    }
}
