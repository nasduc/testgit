package com.terabits.siteoperation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p> Description:  userController </p>
 * <pre> </pre>
 *
 *
 * @author Administrator
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Map USER_MAP = new ConcurrentHashMap();

    @RequestMapping("/add")
    public String add(String userId, String userName) {
        USER_MAP.put(userId, userName);

        return userId + " " + userName + " " + UUID.randomUUID().toString();
    }

    @RequestMapping("/findById")
    public String findById(String userId) {

        System.out.println("9191");

        return (String) USER_MAP.get(userId);
    }
}
