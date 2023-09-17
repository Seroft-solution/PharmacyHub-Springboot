package com.pharmacy.hub.controller;

import com.pharmacy.hub.entity.User;
import com.pharmacy.hub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}





