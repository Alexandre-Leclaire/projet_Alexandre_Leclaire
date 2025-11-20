package org.example.projet_alexandre_leclaire.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.projet_alexandre_leclaire.entity.UserEntity;
import org.example.projet_alexandre_leclaire.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor()
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;

    @PostConstruct
    private void initDb() {
        userRepository.saveAll(
                List.of(new UserEntity("Alexandre", "Leclaire", "12 Rue Voltaire", "75000", "Paris", "060000000"))
        );
    }
    @Override
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(long id, UserEntity updated) {
        return userRepository.save(updated);
    }

    @Override
    public Optional<UserEntity> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> getUsers() {
        return List.of((UserEntity) userRepository.findAll());
    }

    @Override
    public UserEntity deleteUser(long id) {
        return userRepository.deleteById(id);
    }
}