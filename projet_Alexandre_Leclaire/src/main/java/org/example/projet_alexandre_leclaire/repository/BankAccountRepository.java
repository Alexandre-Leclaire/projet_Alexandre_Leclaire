package org.example.projet_alexandre_leclaire.repository;

import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Incomplete / not tested
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    BankAccountEntity deleteById(long id);
}
