package org.example.projet_alexandre_leclaire.service;


import org.example.projet_alexandre_leclaire.entity.UserEntity;

import java.util.Optional;

public interface IUserService {
    Optional<UserEntity> getUser(Long id);

    //Methodes d'action
    public UserEntity saveUser(UserEntity user);
    public UserEntity updateUser(long id, UserEntity updated);
    public UserEntity deleteUser(long id);

}
