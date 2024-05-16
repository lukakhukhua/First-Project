package com.others.firstProject.repositories;

import com.others.firstProject.model.entity.RegistryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistryUserRepository extends JpaRepository<RegistryUser, Long> {

    @Query("SELECT ru.id FROM RegistryUser ru WHERE ru.RegId = :#{#registryUser.regId}")
    Optional<Long> findIdByRegId(@Param("registryUser") RegistryUser registryUser);

}
