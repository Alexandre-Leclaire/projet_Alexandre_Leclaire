package org.example.projet_alexandre_leclaire.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

//Common account entity
@Entity
@NoArgsConstructor
@Data
public class BankAccountEntity {

    @Id
    @GeneratedValue
    private long accountNumber;

    //UserId attached to the account
    @ManyToOne
    @JoinColumn(name = "userEntity_id")
    private UserEntity user;

    private double accountBalance;
    private Timestamp openingDate;

}
