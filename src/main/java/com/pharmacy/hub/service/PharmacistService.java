package com.pharmacy.hub.service;

import com.pharmacy.hub.entity.Pharmacist;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Pharmacist}.
 */
public interface PharmacistService
{
	/**
	 * Save a Pharmacist.
	 *
	 * @param Pharmacist the entity to save.
	 * @return the persisted entity.
	 */
	Pharmacist save(Pharmacist Pharmacist);

	/**
	 * Updates a Pharmacist.
	 *
	 * @param Pharmacist the entity to update.
	 * @return the persisted entity.
	 */
	Pharmacist update(Pharmacist Pharmacist);

	/**
	 * Partially updates a Pharmacist.
	 *
	 * @param Pharmacist the entity to update partially.
	 * @return the persisted entity.
	 */
	Optional<Pharmacist> partialUpdate(Pharmacist Pharmacist);

	/**
	 * Get all the Pharmacist.
	 *
	 * @return the list of entities.
	 */
	List<Pharmacist> findAll();
	
	/**
	 * Get the "id" Pharmacist.
	 *
	 * @param id the id of the entity.
	 * @return the entity.
	 */
	Optional<Pharmacist> findOne(Long id);

	/**
	 * Delete the "id" Pharmacist.
	 *
	 * @param id the id of the entity.
	 */
	void delete(Long id);
}
