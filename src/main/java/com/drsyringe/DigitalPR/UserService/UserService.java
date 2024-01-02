package com.drsyringe.DigitalPR.UserService;



import com.drsyringe.DigitalPR.UserEntity.User;
import com.drsyringe.DigitalPR.UserRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepo repository;

    public String saveUser(User user) {
        repository.save(user);
        return "hii";
    }
}
