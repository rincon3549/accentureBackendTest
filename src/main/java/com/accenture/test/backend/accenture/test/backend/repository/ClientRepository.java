package com.accenture.test.backend.accenture.test.backend.repository;

import com.accenture.test.backend.accenture.test.backend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByIdentificationcard(int id);
}
