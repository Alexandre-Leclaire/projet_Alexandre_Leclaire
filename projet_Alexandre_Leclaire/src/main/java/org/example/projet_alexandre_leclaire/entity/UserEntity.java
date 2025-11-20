package org.example.projet_alexandre_leclaire.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String address;
    private String cityCode;
    private String cityName;
    private String phoneNumber;

    public UserEntity(String firstName, String lastName, String address, String cityCode, String cityName, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.phoneNumber = phoneNumber;
    }

}
