package com.others.firstProject.repositories;

import com.others.firstProject.model.entity.RegistryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryUserRepository extends JpaRepository<RegistryUser, Long> {

}
