package org.example.projet_alexandre_leclaire.service.client;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
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
                List.of(new UserEntity("Alexandre", "Leclaire", "12 Rue Voltaire", "75000", "Paris", "060000000"),
                        new UserEntity("Lambda", "Test", "12 Rue Voltaire", "75000", "Paris", "060000000"),
                        new UserEntity("Alpha", "Test", "12 Rue Voltaire", "75000", "Paris", "060000000"),
                        new UserEntity("Mu", "Test", "12 Rue Voltaire", "75000", "Paris", "060000000"))
        );
    }
    @Override
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(long id, UserEntity updated)
    {
        if (userRepository.existsById(id) && updated.getId() == id)
        {
            return userRepository.save(updated);
        }
        else
        {
            return null;
        }
    }

    @Override
    public List<BankAccountEntity> getUserBankAccounts(Long id) {
        Optional<UserEntity> client = userRepository.findById(id);
        if (client.isPresent())
        {
            return userRepository.findById(id).get().getBankAccountList();
        }
        return null;
    }

    @Override
    public Optional<UserEntity> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity deleteUser(long id) {
        return userRepository.deleteById(id);
    }
}