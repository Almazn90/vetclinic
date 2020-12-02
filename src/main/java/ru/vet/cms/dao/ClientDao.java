package ru.vet.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vet.cms.domain.Client;

public interface ClientDao extends JpaRepository<Client, Long> {
}
