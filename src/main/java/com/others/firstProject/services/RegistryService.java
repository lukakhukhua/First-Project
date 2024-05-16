package com.others.firstProject.services;

import com.others.firstProject.model.entity.Registry;
import com.others.firstProject.model.entity.RegistryUser;

public interface RegistryService {

    void addRegistry(Registry registry) throws Exception;

    void changeRegistry(Registry registry) throws Exception;

    void addRegistryUser(RegistryUser registryUser) throws Exception;

    void changeRegistryUser(RegistryUser registryUser) throws Exception;
}
