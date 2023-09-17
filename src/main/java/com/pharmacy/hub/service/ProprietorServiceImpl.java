package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.Proprietor;
import com.pharmacy.hub.repository.ProprietorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Proprietor}.
 */
@Service
@Transactional
public class ProprietorServiceImpl implements ProprietorService
{

  private final Logger log = LoggerFactory.getLogger(ProprietorServiceImpl.class);

  private final ProprietorRepository proprietorRepository;

  public ProprietorServiceImpl(ProprietorRepository proprietorRepository)
  {
    this.proprietorRepository = proprietorRepository;
  }

  @Override
  public Proprietor save(Proprietor Proprietor)
  {
    log.debug("Request to save Proprietor : {}", Proprietor);
    return proprietorRepository.save(Proprietor);
  }

  @Override
  public Proprietor update(Proprietor Proprietor)
  {
    log.debug("Request to save Proprietor : {}", Proprietor);
    return proprietorRepository.save(Proprietor);
  }

  @Override
  public Optional<Proprietor> partialUpdate(Proprietor Proprietor)
  {
    return null;
  }

  @Override
  public Optional<Proprietor> findOne(Long id)
  {
    return Optional.empty();
  }

  @Override
  public void delete(Long id)
  {
    log.debug("Request to delete Proprietor : {}", id);
    proprietorRepository.deleteById(id);
  }
}

