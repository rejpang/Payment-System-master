package com.payment.collection.service;

import com.payment.collection.controller.exception.NoTransactionFoundError;
import com.payment.collection.model.Liability;
import com.payment.collection.repo.LiabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiabilityServiceImpl implements LiabilityService {

    private final LiabilityRepository liabilityRepository;

    public LiabilityServiceImpl(LiabilityRepository liabilityRepository) {
        this.liabilityRepository = liabilityRepository;
    }

    @Override
    public List<Liability> getAll() {
        return (List<Liability>) liabilityRepository.findAll();
    }

    @Override
    public void save(Liability liability) {
        try {
            liabilityRepository.save(liability);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public void delete(Long id) {
        try {
            liabilityRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public Liability find(Long id) {
        try {
            return liabilityRepository.findById(id).get();
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }
}
