package com.payment.collection.controller;

import com.payment.collection.model.LiabilityDetail;
import com.payment.collection.service.LiabilityDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"/liabilityDetail"})
public class LiabilityDetailController implements DefaultController<LiabilityDetail, Long> {

    private final LiabilityDetailService liabilityDetailService;

    public LiabilityDetailController(LiabilityDetailService liabilityDetailService) {
        this.liabilityDetailService = liabilityDetailService;
    }

    @Override
    @RequestMapping({""})
    public ResponseEntity getAll() {
        return new ResponseEntity(liabilityDetailService.getAll(), HttpStatus.ACCEPTED) ;
    }

    @Override
    @PostMapping({"/add"})
    public ResponseEntity add(LiabilityDetail liabilityDetail) {
        liabilityDetailService.save(liabilityDetail);
        return new ResponseEntity(liabilityDetailService.getAll(), HttpStatus.ACCEPTED);
    }

    @Override
    @PutMapping({"/update"})
    public ResponseEntity update(LiabilityDetail liabilityDetail) {
        liabilityDetailService.save(liabilityDetail);
        return new ResponseEntity(liabilityDetailService.getAll(), HttpStatus.ACCEPTED);
    }

    @Override
    @DeleteMapping({"/delele"})
    public ResponseEntity delete(Long id) {
        liabilityDetailService.delete(id);
        return new ResponseEntity(liabilityDetailService.getAll(), HttpStatus.ACCEPTED);
    }
}
