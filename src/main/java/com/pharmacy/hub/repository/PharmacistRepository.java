package com.pharmacy.hub.repository;

import com.pharmacy.hub.entity.Pharmacist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data SQL repository for the Pharmacist entity.
 */
@Repository
public interface PharmacistRepository extends JpaRepository<Pharmacist, Long>
{
}
