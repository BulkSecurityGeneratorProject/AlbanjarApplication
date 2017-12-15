package de.amme.albanjar.service;

import de.amme.albanjar.service.dto.AlbanjarDeliveryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing AlbanjarDelivery.
 */
public interface AlbanjarDeliveryService {

    /**
     * Save a albanjarDelivery.
     *
     * @param albanjarDeliveryDTO the entity to save
     * @return the persisted entity
     */
    AlbanjarDeliveryDTO save(AlbanjarDeliveryDTO albanjarDeliveryDTO);

    /**
     * Get all the albanjarDeliveries.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<AlbanjarDeliveryDTO> findAll(Pageable pageable);

    /**
     * Get the "id" albanjarDelivery.
     *
     * @param id the id of the entity
     * @return the entity
     */
    AlbanjarDeliveryDTO findOne(Long id);

    /**
     * Delete the "id" albanjarDelivery.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
