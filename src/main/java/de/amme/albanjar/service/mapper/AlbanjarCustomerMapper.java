package de.amme.albanjar.service.mapper;

import de.amme.albanjar.domain.*;
import de.amme.albanjar.service.dto.AlbanjarCustomerDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity AlbanjarCustomer and its DTO AlbanjarCustomerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AlbanjarCustomerMapper extends EntityMapper<AlbanjarCustomerDTO, AlbanjarCustomer> {

    

    @Mapping(target = "deliveries", ignore = true)
    AlbanjarCustomer toEntity(AlbanjarCustomerDTO albanjarCustomerDTO);

    default AlbanjarCustomer fromId(Long id) {
        if (id == null) {
            return null;
        }
        AlbanjarCustomer albanjarCustomer = new AlbanjarCustomer();
        albanjarCustomer.setId(id);
        return albanjarCustomer;
    }
}
