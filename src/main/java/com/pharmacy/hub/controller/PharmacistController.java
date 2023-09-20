package com.pharmacy.hub.controller;

import com.pharmacy.hub.entity.Pharmacist;
import com.pharmacy.hub.entity.User;
import com.pharmacy.hub.service.PharmacistService;
import com.pharmacy.hub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PharmacistController
{
  @Autowired private PharmacistService pharmacistService;

  @PostMapping("/pharmacist")
  public ResponseEntity<Pharmacist> addUser(@RequestBody Pharmacist pharmacist)
  {
    return new ResponseEntity<Pharmacist>(pharmacistService.createPharmacist(pharmacist), HttpStatus.OK);
  }
  
  @GetMapping("/pharmacist")
  public ResponseEntity<List<Pharmacist>> getAllPharmacist()
  {
    return new ResponseEntity<List<Pharmacist>>(pharmacistService.findAll(), HttpStatus.OK);
  }

}





