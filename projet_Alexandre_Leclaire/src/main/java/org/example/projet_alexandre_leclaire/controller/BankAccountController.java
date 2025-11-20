package org.example.projet_alexandre_leclaire.controller;

import lombok.RequiredArgsConstructor;
import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.service.bank.IBankService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//Incomplete feature
public class BankAccountController {
    private final IBankService bankService;

    @PostMapping("/bankAccount/{value}")
    boolean sendPayment(@RequestBody BankAccountEntity bank1, @RequestBody BankAccountEntity bank2, @PathVariable double value) { return bankService.sendPayment(bank1, bank2, value); }
}
