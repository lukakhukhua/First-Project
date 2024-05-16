package com.others.firstProject.model.mappers;

import com.others.firstProject.model.dtos.RegistryDto;
import com.others.firstProject.model.dtos.RegistryUserDto;
import com.others.firstProject.model.entity.Registry;
import com.others.firstProject.model.entity.RegistryUser;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistryMapper {

    public static RegistryDto RegistryToDto(Registry registry) {
        RegistryDto registryDto = new RegistryDto();

//        registryDto.setId(registry.getId());
        registryDto.setFirstName(registry.getFirstName());
        registryDto.setLastName(registry.getLastName());
//        registryDto.setBirthDate(registry.getBirthDate());
//        registryDto.setRelativeUserId(registry.getRelativeUserId());
        registryDto.setAge(registry.getAge());

        return registryDto;
    }

    public static Registry DtoToRegistry(RegistryDto registryDto) {
        Registry registry = new Registry();

//        registry.setId(registryDto.getId());
        registry.setFirstName(registryDto.getFirstName());
        registry.setLastName(registryDto.getLastName());
        registry.setBirthDate(registryDto.getBirthDate());
        registry.setRelativeUserId(registryDto.getRelativeUserId());
//        registry.setAge(registryDto.getAge());

        return registry;
    }

    public static RegistryUserDto RegistryUserToDto(RegistryUser registryUser) {
        RegistryUserDto registryUserDto = new RegistryUserDto();

//        registryUserDto.setId(registryUser.getId());
        registryUserDto.setRegId(registryUser.getRegId());
        registryUserDto.setFirstName(registryUser.getFirstName());
        registryUserDto.setLastName(registryUser.getLastName());
        registryUserDto.setBirthDate(registryUser.getBirthDate());
        registryUserDto.setMail(registryUser.getMail());
        registryUserDto.setDescription(registryUser.getDescription());
        registryUserDto.setAge(registryUser.getAge());

        return registryUserDto;
    }

    public static RegistryUser DtoToRegistryUser(RegistryUserDto registryUserDto) {
        RegistryUser registryUser = new RegistryUser();

//        registryUser.setId(registryUserDto.getId());
        registryUser.setRegId(registryUserDto.getRegId());
        registryUser.setFirstName(registryUserDto.getFirstName());
        registryUser.setLastName(registryUserDto.getLastName());
        registryUserDto.setBirthDate(registryUser.getBirthDate());
        registryUserDto.setMail(registryUser.getMail());
        registryUserDto.setDescription(registryUser.getDescription());
//        registryUserDto.setAge(registryUser.getAge());

        return registryUser;
    }

}
