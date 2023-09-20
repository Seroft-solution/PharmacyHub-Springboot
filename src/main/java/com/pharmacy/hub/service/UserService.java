package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.Pharmacist;
import com.pharmacy.hub.entity.User;

import java.util.List;

public interface UserService
{
  User createUser(User user);

  List<User> findAll();
}
