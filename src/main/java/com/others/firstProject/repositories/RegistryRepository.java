package com.others.firstProject.repositories;

import com.others.firstProject.model.entity.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {

    @Query("SELECT r.id FROM Registry r WHERE r.firstName = :#{#registry.firstName} AND r.lastName = :#{#registry.lastName} AND " +
            "r.birthDate = :#{#registry.birthDate} AND r.relativeUserId = :#{#registry.relativeUserId}")
    Optional<Long> findRegistryId(@Param("registry") Registry registry);

}
