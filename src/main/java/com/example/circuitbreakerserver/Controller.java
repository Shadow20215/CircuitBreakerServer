package com.example.circuitbreakerserver;

import com.example.circuitbreakerserver.DB.UserRepo;
import com.example.circuitbreakerserver.DB.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Queue;

@RestController
@RequestMapping("server")
public class Controller {
    @Autowired
    private UserRepo userRepo;
    private int number = 0;

    @GetMapping("addUser")
    public HttpStatus addUser(@RequestParam("name") String name,@RequestParam("surname") String surname,
                              @RequestParam("age") Integer age){
        number++;
        if(number >= 3){
            if (number ==4) number = 0;
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE);
        }
        else {
            userRepo.save(new Users(name, surname, age));
            return HttpStatus.OK;
        }
    }

}
