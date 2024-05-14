package com.others.firstProject.controller;

import com.others.firstProject.model.dtos.RegistryDto;
import com.others.firstProject.model.mappers.RegistryMapper;
import com.others.firstProject.services.RegistryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerRegistry {

    private final RegistryService registryService;

    @PostMapping(value = "addRegistry")
    public void addRegistry(@RequestBody RegistryDto registryDto) {
        registryService.addRegistry(RegistryMapper.DtoToRegistry(registryDto));
    }
}
