package com.payment.collection.bootstrap;

import com.payment.collection.model.Customer;
import com.payment.collection.model.Liability;
import com.payment.collection.model.LiabilityDetail;
import com.payment.collection.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public DataLoader(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Liability liability = new Liability();
        Customer customer = new Customer();
        LiabilityDetail liabilityDetail = new LiabilityDetail();

        liability.setLiabilityId(1L);
        customer.setCustomerId(2L);
        customer.setBalance(BigDecimal.valueOf(5000));
        customer.setName("Rex");

        liabilityDetail.setLiabilityDetailId(3L);
        liabilityDetail.setName("Meralco");
        liabilityDetail.setObligation(BigDecimal.valueOf(3000));
        liabilityDetail.setNetAmount(customer.getBalance().subtract(liabilityDetail.getObligation()));
        liabilityDetail.setCreatedBy("Rex");
        liabilityDetail.setUpdatedBy("Rex");
        liabilityDetail.setCreatedDate(simpleDateFormat.format(new Date()));
        liabilityDetail.setUpdatedDate(simpleDateFormat.format(new Date()));

        List<Liability> liabilityList = new ArrayList<>();
        liability.setLiabilityDetail(liabilityDetail);
        liabilityList.add(liability);

        customer.setLiabilityList(liabilityList);
        customerRepository.save(customer);

    }
}
