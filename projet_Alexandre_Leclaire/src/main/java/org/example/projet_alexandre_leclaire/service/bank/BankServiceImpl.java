package org.example.projet_alexandre_leclaire.service.bank;

import lombok.RequiredArgsConstructor;
import org.example.projet_alexandre_leclaire.entity.BankAccountEntity;
import org.example.projet_alexandre_leclaire.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
//Incomplete
public class BankServiceImpl implements IBankService {
    private BankAccountRepository bankAccountRepository;

    @Override
    public Optional<BankAccountEntity> getBankAccount(Long id) {
        return bankAccountRepository.findById(id);
    }

    @Override
    public BankAccountEntity saveBankAccount(BankAccountEntity bankAccount) {
        return bankAccountRepository.save(bankAccount);
    }

    @Override
    public BankAccountEntity updateBankAccount(long id, BankAccountEntity updatedBank) {
        if (bankAccountRepository.findById(id).isPresent() && id == updatedBank.getAccountNumber())
        {
            return bankAccountRepository.save(updatedBank);
        }
        return null;
    }

    @Override
    public BankAccountEntity deleteBankAccount(long id) {
        return bankAccountRepository.deleteById(id);
    }

    // Send payment from account1 to account2
    @Override
    public boolean sendPayment(BankAccountEntity bankAccount1, BankAccountEntity bankAccount2, double value) {
        if (value > 0 && bankAccount1.getAccountBalance() >= value)
        {
            bankAccount2.setAccountBalance(bankAccount2.getAccountBalance() + value);
            bankAccount1.setAccountBalance(bankAccount1.getAccountBalance() - value);
            return true;
        }
        return false;
    }
}
