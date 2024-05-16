package com.others.firstProject.controller;

import com.others.firstProject.model.dtos.RegistryDto;
import com.others.firstProject.model.dtos.RegistryUserDto;
import com.others.firstProject.model.mappers.RegistryMapper;
import com.others.firstProject.services.RegistryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/relatives/{relativeUserId}")
    public List<RegistryDto> findByRelativeUserId(@PathVariable String relativeUserId) {
        return registryService.getUserRelativesById(Long.parseLong(relativeUserId)).stream().map(RegistryMapper::RegistryToDto).toList();
    }

}
