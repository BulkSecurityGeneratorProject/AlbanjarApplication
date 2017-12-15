package de.amme.albanjar.repository;

import de.amme.albanjar.domain.AlbanjarProduct;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the AlbanjarProduct entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlbanjarProductRepository extends JpaRepository<AlbanjarProduct, Long> {

}
