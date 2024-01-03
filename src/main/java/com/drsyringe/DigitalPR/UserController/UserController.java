package com.drsyringe.DigitalPR.UserController;
import com.drsyringe.DigitalPR.UserDTO.UserDTO;
import com.drsyringe.DigitalPR.UserEntity.User;
import com.drsyringe.DigitalPR.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // to connect with restfull-api
@CrossOrigin
@RequestMapping("/user") // to handle JSON request from DTO
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String printHelloWorld() {
        return "Hello World";
    }

    @PostMapping(path = "/save") //from post request in API on method save
    public String saveUser(@RequestBody UserDTO userDTO){
     return userService.saveUser(userDTO.toUser()); // we pass this request to User Service Which comes from User Dto
    }
    //get user data
    @GetMapping(path = "/getUser") //from post request in API on method save
    public List<UserDTO> getUser(){
        List<UserDTO>allUsers = userService.getUser();
        return allUsers;
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") int id)
    {
        boolean deleteUser = userService.deleteUser(id);
        if (deleteUser){
            return "deleted";
        }
        else {
            return "Invalid UserId";
        }

    }

}
