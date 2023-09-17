package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.User;
import com.pharmacy.hub.exceptions.ItemAlreadyExistsException;
import com.pharmacy.hub.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{

  @Autowired
  private PasswordEncoder bcryptEncoder;

  @Autowired
  private UserRepository userRepository;

  @Override
  public User createUser(User user)
  {
    return userRepository.save(user);
  }


}
