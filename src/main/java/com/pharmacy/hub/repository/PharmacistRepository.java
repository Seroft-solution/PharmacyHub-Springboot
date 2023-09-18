package com.pharmacy.hub.repository;

import com.pharmacy.hub.entity.Pharmacist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Pharmacist entity.
 */
@Repository
public interface PharmacistRepository extends JpaRepository<Pharmacist, Long>
{
}
