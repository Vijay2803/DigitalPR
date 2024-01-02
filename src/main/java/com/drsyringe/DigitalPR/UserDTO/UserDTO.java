package com.drsyringe.DigitalPR.UserDTO;

import com.drsyringe.DigitalPR.UserEntity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// all the user data will pass through DTO onl
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String userName;
    private int userMobile;

    //create a parameter constructor

    public User toUser(){
        return new User(

                this.userName,
                this.userMobile
        );
    }



}
