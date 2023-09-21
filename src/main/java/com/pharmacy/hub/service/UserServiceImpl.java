package com.pharmacy.hub.service;

import com.pharmacy.hub.dto.UserDTO;
import com.pharmacy.hub.entity.Pharmacist;
import com.pharmacy.hub.entity.Proprietor;
import com.pharmacy.hub.entity.User;
import com.pharmacy.hub.repository.PharmacistRepository;
import com.pharmacy.hub.repository.ProprietorRepository;
import com.pharmacy.hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private PharmacistRepository pharmacistRepository;
  @Autowired
  private ProprietorRepository proprietorRepository;


  @Override
  public User createUser(User user)
  {
    Pharmacist pharmacist = user.getPharmacist();
    Proprietor proprietor = user.getProprietor();

    user.setPharmacist(null);
    user.setProprietor(null);

    User createdUser = userRepository.save(user);

    if (pharmacist != null)
    {
      pharmacist.setUser(createdUser);
      pharmacistRepository.save(pharmacist);
    }
    if (proprietor != null)
    {
      proprietor.setUser(createdUser);
      proprietorRepository.save(proprietor);
    }

    return createdUser;
  }

  @Override
  public List<User> findAll()
  {
    return userRepository.findAll();
  }

  @Override
  public User validateLogin(UserDTO userDTO)
  {
    if(userDTO.getPassword().isEmpty())
    {
      return userRepository.findByEmailAddress(userDTO.getEmailAddress());
    }
    else
    {
      return userRepository.findByEmailAddressAndPassword(userDTO.getEmailAddress(), userDTO.getPassword());
    }
  }


}
