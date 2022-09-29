package com.payment.collection.controller;

import com.payment.collection.model.Liability;
import com.payment.collection.service.LiabilityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/liabilities"})
public class LiabilityController implements DefaultController<Liability, Long> {

    private final LiabilityService liabilityService;

    public LiabilityController(LiabilityService liabilityService) {
        this.liabilityService = liabilityService;
    }

    @RequestMapping({""})
    @Override
    public ResponseEntity getAll(){
        return new ResponseEntity(liabilityService.getAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping({"/add"})
    @Override
    public ResponseEntity add(@RequestBody Liability liability){
        liabilityService.save(liability);
        return new ResponseEntity(liabilityService.getAll(), HttpStatus.ACCEPTED);
    }

    @PutMapping({"/update"})
    @Override
    public ResponseEntity update(@RequestBody Liability liability){
        liabilityService.save(liability);
        return new ResponseEntity(liabilityService.getAll(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping({"/delete"})
    @Override
    public ResponseEntity delete(@RequestBody Long id){
        liabilityService.delete(id);
        return new ResponseEntity(liabilityService.getAll(), HttpStatus.ACCEPTED);
    }
}
