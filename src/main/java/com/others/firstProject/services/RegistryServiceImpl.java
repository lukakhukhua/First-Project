package com.others.firstProject.services;

import com.others.firstProject.model.entity.Registry;
import com.others.firstProject.model.entity.RegistryUser;
import com.others.firstProject.repositories.RegistryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistryServiceImpl implements RegistryService {

    @Override
    @Transactional
    public void addRegistry(Registry registry) throws Exception {
        Optional<Long> existingRegistryId = registryRepository.findRegistryId(registry);

        if (existingRegistryId.isPresent()) {
            throw new RuntimeException("Registry already exists with ID: " + existingRegistryId.get());
        } else {
            registryRepository.save(registry);
        }

        System.out.println(registry + " has been added to the database");
    }

    private final RegistryRepository registryRepository;

    @Override
    @Transactional
    public void changeRegistry(Registry registry) throws Exception {
        Optional<Registry> existingRegistry = registryRepository.findById(registry.getId());

        if (existingRegistry.isPresent()) {
            Registry existing = existingRegistry.get();
            existing.setFirstName(registry.getFirstName());
            existing.setLastName(registry.getLastName());
            existing.setBirthDate(registry.getBirthDate());
            existing.setRelativeUserId(registry.getRelativeUserId());
            registryRepository.save(existing);
        } else {
            throw new RuntimeException("Registry not found");
        }
    }

    @Override
    public void addRegistryUser(RegistryUser registryUser) throws Exception {

    }

    @Override
    public void changeRegistryUser(RegistryUser registryUser) throws Exception {

    }
}
