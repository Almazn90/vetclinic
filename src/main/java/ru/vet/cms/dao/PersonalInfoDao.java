package ru.vet.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vet.cms.domain.PersonalInfo;

public interface PersonalInfoDao extends JpaRepository<PersonalInfo, Long> {
}
