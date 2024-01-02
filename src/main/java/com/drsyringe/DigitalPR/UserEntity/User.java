package com.drsyringe.DigitalPR.UserEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user") // to create a table user in mysql table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id // to mention as private key
    @Column(name = "user_id", length = 50) // to set column name in table and define length of the entity
    @GeneratedValue(strategy = GenerationType.AUTO) // to set auto increment
    private int userId;
    @Column(name = "user_name", length = 50)
    private String userName;
    @Column(name = "user_mobile", length = 12)
    private int userMobile;

    public User(String userName, int userMobile) {
        this.userName = userName;
        this.userMobile = userMobile;
    }
}


