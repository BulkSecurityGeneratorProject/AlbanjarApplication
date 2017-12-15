package de.amme.albanjar.service.mapper;

import de.amme.albanjar.domain.*;
import de.amme.albanjar.service.dto.AlbanjarDeliveryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity AlbanjarDelivery and its DTO AlbanjarDeliveryDTO.
 */
@Mapper(componentModel = "spring", uses = {AlbanjarCustomerMapper.class, AlbanjarProductMapper.class})
public interface AlbanjarDeliveryMapper extends EntityMapper<AlbanjarDeliveryDTO, AlbanjarDelivery> {

    @Mapping(source = "albanjarCustomer.id", target = "albanjarCustomerId")
    @Mapping(source = "albanjarProduct.id", target = "albanjarProductId")
    AlbanjarDeliveryDTO toDto(AlbanjarDelivery albanjarDelivery); 

    @Mapping(source = "albanjarCustomerId", target = "albanjarCustomer")
    @Mapping(source = "albanjarProductId", target = "albanjarProduct")
    AlbanjarDelivery toEntity(AlbanjarDeliveryDTO albanjarDeliveryDTO);

    default AlbanjarDelivery fromId(Long id) {
        if (id == null) {
            return null;
        }
        AlbanjarDelivery albanjarDelivery = new AlbanjarDelivery();
        albanjarDelivery.setId(id);
        return albanjarDelivery;
    }
}
