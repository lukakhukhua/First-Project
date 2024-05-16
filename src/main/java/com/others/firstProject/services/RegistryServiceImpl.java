package com.others.firstProject.services;

import com.others.firstProject.model.entity.Registry;
import com.others.firstProject.model.entity.RegistryUser;
import com.others.firstProject.repositories.RegistryRepository;
import com.others.firstProject.repositories.RegistryUserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistryServiceImpl implements RegistryService {

    private final RegistryRepository registryRepository;
    private final RegistryUserRepository registryUserRepository;


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

        System.out.println("The registry with id: " + registry.getId() + " has been changed");
    }

    @Override
    @Transactional
    public void addRegistryUser(RegistryUser registryUser) throws Exception {
        Optional<Long> existingRegistryId = registryUserRepository.findIdByRegId(registryUser);

        if (existingRegistryId.isPresent()) {
            throw new RuntimeException("Registry does not exist with RegId: " + registryUser.getRegId());
        } else {
            registryUserRepository.save(registryUser);
        }

        System.out.println(registryUser + " has been added to the database");
    }

    @Override
    @Transactional
    public void changeRegistryUser(RegistryUser registryUser) throws Exception {
        Optional<RegistryUser> existingRegistryUser = registryUserRepository.findById(registryUser.getId());

        if (existingRegistryUser.isPresent()) {
            RegistryUser existing = existingRegistryUser.get();

            existing.setFirstName(registryUser.getFirstName());
            existing.setLastName(registryUser.getLastName());
            existing.setBirthDate(registryUser.getBirthDate());
            existing.setMail(registryUser.getMail());
            existing.setDescription(registryUser.getDescription());

            registryUserRepository.save(existing);

            System.out.println("The registry user with ID: " + existing.getId() + " has been changed");
        } else {
            throw new RuntimeException("RegistryUser not found with ID: " + registryUser.getId());
        }
    }

}
