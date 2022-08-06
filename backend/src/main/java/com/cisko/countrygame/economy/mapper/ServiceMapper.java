package com.cisko.countrygame.economy.mapper;

import com.cisko.countrygame.economy.data.ServiceDTO;
import com.cisko.countrygame.economy.entity.ServiceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ServiceMapper {

    ServiceDTO toDto(ServiceEntity entity);
    ServiceEntity toEntity(ServiceDTO dto);

}
