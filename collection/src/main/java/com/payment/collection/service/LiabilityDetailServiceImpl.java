package com.payment.collection.service;

import com.payment.collection.controller.exception.NoTransactionFoundError;
import com.payment.collection.model.LiabilityDetail;
import com.payment.collection.repo.LiabilityDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiabilityDetailServiceImpl implements LiabilityDetailService {

    private final LiabilityDetailRepository liabilityDetailRepository;

    public LiabilityDetailServiceImpl(LiabilityDetailRepository liabilityDetailRepository) {
        this.liabilityDetailRepository = liabilityDetailRepository;
    }

    @Override
    public List<LiabilityDetail> getAll() {
        return (List<LiabilityDetail>) liabilityDetailRepository.findAll();
    }

    @Override
    public void save(LiabilityDetail liabilityDetail) {
        try {
            liabilityDetailRepository.save(liabilityDetail);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public void delete(Long id) {
        try {
            liabilityDetailRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public LiabilityDetail find(Long id) {
        try {
            return liabilityDetailRepository.findById(id).get();
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }
}
