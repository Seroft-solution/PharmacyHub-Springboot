package com.pharmacy.hub.controller;

import com.pharmacy.hub.entity.Pharmacist;
import com.pharmacy.hub.entity.User;
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
public class UserController
{
  @Autowired private UserService userService;

  @PostMapping("/user")
  public ResponseEntity<User> addUser(@RequestBody User user)
  {
    return new ResponseEntity<User>(userService.createUser(user), HttpStatus.OK);
  }

  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUsers()
  {
    return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK);
  }

}





