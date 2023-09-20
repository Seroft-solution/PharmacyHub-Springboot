package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.Pharmacist;
import com.pharmacy.hub.repository.PharmacistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PharmacistServiceImpl implements PharmacistService
{
  private final Logger log = LoggerFactory.getLogger(PharmacistServiceImpl.class);

  private final PharmacistRepository pharmacistRepository;

  public PharmacistServiceImpl(PharmacistRepository pharmacistRepository)
  {
    this.pharmacistRepository = pharmacistRepository;
  }

  @Override
  public Pharmacist save(Pharmacist Pharmacist)
  {
    log.debug("Request to save Pharmacist : {}", Pharmacist);
    return pharmacistRepository.save(Pharmacist);
  }

  @Override
  public Pharmacist update(Pharmacist Pharmacist)
  {
    log.debug("Request to save Pharmacist : {}", Pharmacist);
    return pharmacistRepository.save(Pharmacist);
  }

  @Override
  public Optional<Pharmacist> partialUpdate(Pharmacist Pharmacist)
  {
    log.debug("Request to partially update Pharmacist : {}", Pharmacist);
    return null;
  }

  @Override
  @Transactional(readOnly = true)
  public List<Pharmacist> findAll()
  {
    return pharmacistRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Optional<Pharmacist> findOne(Long tagNumber)
  {
    log.debug("Request to get Pharmacist : {}", tagNumber);
    return null;
  }

  @Override
  public void delete(Long id)
  {
    log.debug("Request to delete Pharmacist : {}", id);
    pharmacistRepository.deleteById(id);
  }

  @Override
  public Pharmacist createPharmacist(Pharmacist pharmacist)
  {
    return pharmacistRepository.save(pharmacist);
  }

}



