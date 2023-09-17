package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.Proprietor;

import java.util.Optional;

/**
 * Service Interface for managing {@link Proprietor}.
 */
public interface ProprietorService
{
  /**
   * Save a Proprietor.
   * @param Proprietor the entity to save.
   * @return the persisted entity.
   */
  Proprietor save(Proprietor Proprietor);

  /**
   * Updates a Proprietor.
   * @param Proprietor the entity to update.
   * @return the persisted entity.
   */
  Proprietor update(Proprietor Proprietor);

  /**
   * Partially updates a Proprietor.
   * @param Proprietor the entity to update partially.
   * @return the persisted entity.
   */
  Optional<Proprietor> partialUpdate(Proprietor Proprietor);


  /**
   * Get the "id" Proprietor.
   * @param id the id of the entity.
   * @return the entity.
   */
  Optional<Proprietor> findOne(Long id);

  /**
   * Delete the "id" Proprietor.
   * @param id the id of the entity.
   */
  void delete(Long id);
}
