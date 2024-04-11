package com.rafael;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rafael.Modelo.User;
import com.rafael.repository.*;


@Component
public class Start implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("RAFEL");
        user.setUsarnema("Rafa");
        user.setPassoword("null");

        repository.save(user);

        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }

    
}
