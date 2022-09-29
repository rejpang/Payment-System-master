package com.payment.collection.controller;

import com.payment.collection.model.LiabilityDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/liabilityDetail"})
public class LiabilityDetailController implements DefaultController<LiabilityDetail, Long> {
    @Override
    @RequestMapping({""})
    public ResponseEntity getAll() {
        return null;
    }

    @Override
    @PostMapping({"/add"})
    public ResponseEntity add(LiabilityDetail liabilityDetail) {
        return null;
    }

    @Override
    @PutMapping({"/update"})
    public ResponseEntity update(LiabilityDetail liabilityDetail) {
        return null;
    }

    @Override
    @DeleteMapping({"/delele"})
    public ResponseEntity delete(Long aLong) {
        return null;
    }
}
