package com.example.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.TreeMap;

@Controller
public class UsersController {
    private TreeMap<Integer, UserEntity> users = new TreeMap<>(){{
        put(1,new UserEntity("Karol", "Nakielski"));
        put(2,new UserEntity("Bartek", "Szewczyk"));
        put(3,new UserEntity("Michal", "Szewczyk"));
    }};
    @RequestMapping("/users")
    @ResponseBody
    public Object users() {
        return users.values();
    }
    @RequestMapping("/users/{id}/get")
    @ResponseBody
    public Object getUser(@PathVariable int id) {
        return users.get(id);
    }
    @RequestMapping("/users/{id}/remove")
    @ResponseBody
    public Object removeUser(@PathVariable int id) {
        return users.remove(id);
    }
    //http://localhost:8080/users/add?name=Mateusz&surname=Jawor
    @RequestMapping("/users/add")
    @ResponseBody
    public Object addUser(@RequestParam String name, @RequestParam String surname) {
        users.put(users.lastKey() + 1, new UserEntity(name, surname));
        return users.get(users.lastKey());
    }
}