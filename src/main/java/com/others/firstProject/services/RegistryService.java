package com.others.firstProject.services;

import com.others.firstProject.model.entity.Registry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistryService {

    private final List<Registry> registryList;

    public void addRegistry(Registry registry) {
        // TODO: add registry to the database

        registryList.add(registry);
        System.out.println(registry + " has been added to the database");

        System.out.println("\n All registries: " + registryList.toString());
    }

}
