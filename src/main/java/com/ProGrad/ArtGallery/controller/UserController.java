package com.ProGrad.ArtGallery.controller;


import com.ProGrad.ArtGallery.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/signup")
    public String signUp(@RequestBody User user) {
        return "Inside, signUp Controller....";
    }
}
