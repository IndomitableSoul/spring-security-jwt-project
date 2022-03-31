package com.bridgelabz.springsecurityjwt;

import com.bridgelabz.springsecurityjwt.entity.User;
import com.bridgelabz.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class SpringSecurityJwtApplication
//        implements CommandLineRunner
{

//    @Autowired
//    private UserRepository userRepository;
//
//    Random random = new Random();
//
//    public void createUser(){
//        User user = new User();
//        Long id = new Long(random.nextInt(100));
//        user.setId(id);
//        user.setUsername("user"+id);
//        user.setPassword("user"+id);
//        user.setEmail("user"+id+"@gmail.com");
//        user.setRole("Admin");
//        user.setEnabled(true);
//        this.userRepository.save(user);
//    }




    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        createUser();
//    }
}
