package org.example.projet_alexandre_leclaire.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class BankAccountEntity {

    @Id
    @GeneratedValue
    private long accountNumber;

    private int solde;
    private Timestamp openingDate;
}
