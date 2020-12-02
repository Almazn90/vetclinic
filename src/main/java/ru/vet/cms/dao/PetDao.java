package ru.vet.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vet.cms.domain.Pet;

public interface PetDao extends JpaRepository<Pet, Long> {
}
