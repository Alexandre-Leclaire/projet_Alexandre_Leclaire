package org.example.projet_alexandre_leclaire.service.bank;

import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.entity.UserEntity;

import java.util.Optional;

//Unfinished implementation
public interface IBankService {
    Optional<BankAccountEntity> getBankAccount(Long id);
    //Action methods
    BankAccountEntity saveBankAccount(BankAccountEntity bankAccount);
    BankAccountEntity updateBankAccount(long id, BankAccountEntity updatedBank);
    BankAccountEntity deleteBankAccount(long id);
    boolean sendPayment(BankAccountEntity bankAccount1, BankAccountEntity bankAccount2, double value);


}
