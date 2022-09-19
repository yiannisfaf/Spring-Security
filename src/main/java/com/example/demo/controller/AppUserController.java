package com.example.demo.controller;

import com.example.demo.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
@AllArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping(path = "me")
    public String signedInUser() {
        return appUserService.getSignedInUser();
    }

}
