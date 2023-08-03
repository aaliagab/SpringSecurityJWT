package com.example.repositories;

import com.example.models.ERole;
import com.example.models.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,Long> {

    Optional<RoleEntity> findByName(ERole name);
}
