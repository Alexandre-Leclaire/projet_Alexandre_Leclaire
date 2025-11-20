package org.example.projet_alexandre_leclaire.service.client;


import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<UserEntity> getUser(Long id);
    List<UserEntity> getUsers();
    List<BankAccountEntity> getUserBankAccounts(Long id);

    //Action methods
    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(long id, UserEntity updated);
    UserEntity deleteUser(long id);

}
