package com.pharmacy.hub.service;

import com.pharmacy.hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class SecurityServiceImpl
{
  @Autowired
  UserRepository userRepository;
  
  public boolean hasAccess()
  {
    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    String username;
    if (principal instanceof UserDetails)
    {
      username = ((UserDetails) principal).getUsername();
    }
    else
    {
      username = principal.toString();
    }

    return userRepository.findByEmailAddress(username).get().getRole().equals("admin");
  }
}
