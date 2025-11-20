package org.example.projet_alexandre_leclaire.repository;

import org.example.projet_alexandre_leclaire.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity deleteById(long id);
}
