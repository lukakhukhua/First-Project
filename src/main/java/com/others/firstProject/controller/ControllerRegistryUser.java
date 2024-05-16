package com.others.firstProject.controller;

import com.others.firstProject.model.dtos.RegistryUserDto;
import com.others.firstProject.model.mappers.RegistryMapper;
import com.others.firstProject.services.RegistryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerRegistryUser {

    private final RegistryService registryService;

    @PostMapping(value = "addRegistryUser")
    public void addRegistry(@RequestBody RegistryUserDto registryUserDto) throws Exception {
        registryService.addRegistryUser(RegistryMapper.DtoToRegistryUser(registryUserDto));
    }

    @PutMapping(value = "editRegistryUser")
    public void changeRegistry(@RequestBody RegistryUserDto registryUserDto) throws Exception {
        registryService.changeRegistryUser(RegistryMapper.DtoToRegistryUser(registryUserDto));
    }
}
