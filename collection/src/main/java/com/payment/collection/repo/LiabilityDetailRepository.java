package com.payment.collection.repo;

import com.payment.collection.model.LiabilityDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiabilityDetailRepository extends CrudRepository<LiabilityDetail, Long> {
}
