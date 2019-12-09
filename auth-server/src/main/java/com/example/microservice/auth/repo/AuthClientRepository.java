package com.example.microservice.auth.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.auth.entity.AuthClientDetails;

@Repository
public interface AuthClientRepository extends JpaRepository<AuthClientDetails, String> {
    Optional<AuthClientDetails> findByClientId(String clientId);
}
