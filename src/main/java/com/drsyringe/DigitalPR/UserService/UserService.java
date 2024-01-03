package com.drsyringe.DigitalPR.UserService;
import com.drsyringe.DigitalPR.UserDTO.UserDTO;
import com.drsyringe.DigitalPR.UserEntity.User;
import com.drsyringe.DigitalPR.UserRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepo repository;

    public String saveUser(User user) {
       return String.valueOf(repository.save(user).getUserId());

    }

    public List<UserDTO> getUser(){
        List<User> getUsers = repository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User a:getUsers){
            UserDTO userDTO = new UserDTO(
                    a.getUserName(),
                    a.getUserMobile()
            );
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    public boolean deleteUser(int id) {

        if(repository.existsById(id))
        {
            repository.deleteById(id);
            return true;
        }
        else
        {
            System.out.println("Invalid User Id");
            return false;
        }


    }
}
