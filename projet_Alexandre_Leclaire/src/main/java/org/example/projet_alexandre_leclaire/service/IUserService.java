package org.example.projet_alexandre_leclaire.service;


import org.example.projet_alexandre_leclaire.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<UserEntity> getUser(Long id);
    List<UserEntity> getUsers();

    //Methodes d'action
    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(long id, UserEntity updated);
    UserEntity deleteUser(long id);

}
