package de.amme.albanjar.repository;

import de.amme.albanjar.domain.AlbanjarDelivery;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the AlbanjarDelivery entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlbanjarDeliveryRepository extends JpaRepository<AlbanjarDelivery, Long> {

}
