package org.example.projet_alexandre_leclaire.entity;

import jakarta.persistence.Entity;

@Entity
public class EpargneAccountEntity extends BankAccountEntity {

    private long accountNumber;
    private int overdraft;
    private int cashbackTaux;
}
