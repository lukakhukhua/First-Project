package com.others.firstProject.services;

import com.others.firstProject.model.entity.Registry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistryService {

    private final List<Registry> registryList;

    public void addRegistry(Registry registry) throws Exception {
        // TODO: add registry to the database

        if (registryList.contains(registry)) {
            throw new Exception("Registry already exists");
        }

        registryList.add(registry);

        System.out.println(registry + " has been added to the database");

        System.out.println("\n All registries: " + registryList);
    }

    public void changeRegistry(Registry registry) throws Exception {
        // TODO: change registry to the database

        boolean registryExists = registryList.remove(registry);

        if (!registryExists) {
            throw new Exception("No such registry exists");
        }

        registryList.add(registry);

        System.out.println(registry + " has been changed");

        System.out.println("\n All registries: " + registryList);
    }
}
