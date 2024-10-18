package com.example.tayjava.controller;

import com.example.tayjava.dto.request.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public String addUser(@RequestBody UserRequest request) {
        return "User added";
    }

    @GetMapping("/userList")
    public List<UserRequest> getUsers() {
        return List.of(new UserRequest("Tay", "Java", "phone", "email"),
                new UserRequest("Tay", "Java", "phone", "email"));
    }

    @GetMapping("/{userId}")
    public UserRequest getUser(@PathVariable int userId) {
        System.out.println("Request get user detail by userId " + userId);
        return new UserRequest("Tay", "Java", "phone", "email");
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequest request) {
        System.out.println("Request update userId = " + userId);
        return "User updated";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        System.out.println("Request delete userId = " + userId);
        return "User deleted";
    }
}
