package com.drsyringe.DigitalPR.UserController;
import com.drsyringe.DigitalPR.UserDTO.UserDTO;
import com.drsyringe.DigitalPR.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController // to connect with restfull-api
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
    	System.out.println(userDTO.toString());
    return "Hi";
//        String id = userService.saveUser(userDTO.toUser()); // we pass this request to User Service Which comes from User Dto
//        return id;
    }
}
