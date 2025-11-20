package org.example.projet_alexandre_leclaire.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.example.projet_alexandre_leclaire.entity.UserEntity;
import org.example.projet_alexandre_leclaire.service.IUserService;
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

    @PostMapping("/clients")
    UserEntity createClient(@RequestBody UserEntity user) { return userService.saveUser(user); }

    @PostMapping("/clients/{id}")
    UserEntity updateClient(@PathVariable Long id, @RequestBody UserEntity user) { return userService.updateUser(id, user); }

    @PostMapping("/clients/delete/{id}")
    UserEntity deleteClient(@PathVariable Long id) { return userService.deleteUser(id); }

    //@PostMapping("/clients/payment/")
    //boolean sendPayment(@RequestBody UserEntity user1, UserEntity user2) { return false; } //TODO
}