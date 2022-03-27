package com.example.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {
    @RequestMapping("/users")
    @ResponseBody
    public Object getUsers(){
        List<UserEntity> users = new ArrayList<>();

        users.add(new UserEntity(1L, "John"));
        users.add(new UserEntity(2L, "Matt"));
        users.add(new UserEntity(3L, "Michael"));

        return users;
    }
    @RequestMapping("/users/{id}")
    @ResponseBody
    public Object getUsers(
            @PathVariable Long id
    ){
        return new UserEntity(id, "John" + id);
    }
}
