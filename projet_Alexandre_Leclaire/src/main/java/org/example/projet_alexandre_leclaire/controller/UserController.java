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
}

    // Methode Update
    //@PutMapping("/coffees/{id}")


//    List<Coffee> getCoffees() {
//
//        // Un factory static method qui permet de créer une liste immuable d'éléments
//        // Un factory static method est une méthode statique qui retourne une instance de la classe dans laquelle elle est définie.
//        // Elle est souvent utilisée pour créer des objets de manière plus contrôlée, en encapsulant la logique de création au sein de la classe elle-même.
//        return List.of(
//                new Coffee("Granador"),
//                new Coffee("Espresso"),
//                new Coffee("Cappuccino")
//        );
//    }