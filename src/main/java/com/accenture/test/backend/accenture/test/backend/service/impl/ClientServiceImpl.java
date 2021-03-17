package com.accenture.test.backend.accenture.test.backend.service.impl;

import com.accenture.test.backend.accenture.test.backend.model.Client;
import com.accenture.test.backend.accenture.test.backend.repository.ClientRepository;
import com.accenture.test.backend.accenture.test.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client consultClientId(Integer client_id) {
        return clientRepository.findByIdentificationcard(client_id);
    }
}
