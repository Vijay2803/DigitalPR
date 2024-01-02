package com.drsyringe.DigitalPR.UserRepository;

import com.drsyringe.DigitalPR.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories//to pass data to database in the table User
@Repository // to connect with Repository

//user --> table Integer--> id(primary key)
public interface UserRepo extends JpaRepository<User,Integer> {

}
