package com.payment.collection.repo;

import com.payment.collection.model.Liability;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiabilityRepository extends CrudRepository<Liability, Long> {

}
