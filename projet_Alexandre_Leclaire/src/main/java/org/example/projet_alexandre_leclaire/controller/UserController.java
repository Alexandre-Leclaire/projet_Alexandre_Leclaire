package org.example.projet_alexandre_leclaire.controller;

import lombok.RequiredArgsConstructor;
import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.entity.UserEntity;
import org.example.projet_alexandre_leclaire.service.client.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @GetMapping("/clients")
    List<UserEntity> getClients() { return userService.getUsers(); }

    @GetMapping("/clients/{id}")
    ResponseEntity<UserEntity> getClient(@PathVariable Long id) { return userService.getUser(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build()); }

    //Incomplete feature
    //@GetMapping("/clients/{id}/bankAccounts")
    //ResponseEntity<BankAccountEntity> getBankAccounts(@PathVariable Long id) { return userService.getUserBankAccounts(id).stream().map(ResponseEntity::ok). }

    @PostMapping("/clients")
    UserEntity createClient(@RequestBody UserEntity user) { return userService.saveUser(user); }

    @PostMapping("/clients/{id}")
    UserEntity updateClient(@PathVariable Long id, @RequestBody UserEntity user) { return userService.updateUser(id, user); }

    @PostMapping("/clients/delete/{id}")
    UserEntity deleteClient(@PathVariable Long id) { return userService.deleteUser(id); }

}