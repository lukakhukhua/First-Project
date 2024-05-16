package com.others.firstProject.repositories;

import com.others.firstProject.model.entity.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {
    
}
