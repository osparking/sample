package com.oauth.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @GetMapping("/user-info")
    public Map<String, Object> userInfo() {
        return null;
    }
}
