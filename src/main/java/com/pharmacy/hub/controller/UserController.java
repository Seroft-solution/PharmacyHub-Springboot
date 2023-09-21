package com.pharmacy.hub.controller;

import com.pharmacy.hub.dto.UserDTO;
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

  @PostMapping("/googleauth/login")
  public ResponseEntity<User> googleLogin(@RequestBody UserDTO userDTO)
  {
    User user = userService.validateLogin(userDTO);

    return new ResponseEntity<User>(user, HttpStatus.OK);
  }

  @PostMapping("/login")
  public ResponseEntity<User> userLogin(@RequestBody UserDTO userDTO)
  {
    User user = userService.validateLogin(userDTO);
    return new ResponseEntity<User>(user, HttpStatus.OK);
  }

  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUsers()
  {
    return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK);
  }

}





