package com.others.firstProject.model.mappers;

import com.others.firstProject.model.dtos.RegistryDto;
import com.others.firstProject.model.entity.Registry;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistryMapper {

    public static RegistryDto RegistryToDto(Registry registry) {
        RegistryDto registryDto = new RegistryDto();

        registryDto.setId(registry.getId());
        registryDto.setFirstName(registry.getFirstName());
        registryDto.setLastName(registry.getLastName());

        return registryDto;
    }

    public static Registry DtoToRegistry(RegistryDto registryDto) {
        Registry registry = new Registry();

        registry.setId(registryDto.getId());
        registry.setFirstName(registryDto.getFirstName());
        registry.setLastName(registryDto.getLastName());

        return registry;
    }

}
