package com.inseong.demo.domain.user;


import com.inseong.demo.security.JwtTokenProvider;
import com.inseong.demo.utill.ResponseService;
import com.inseong.demo.utill.SingleResult;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;
    private final JwtTokenProvider jwtTokenProvider;
    private final ResponseService responseService;

    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @PostMapping("/signin")
    public SingleResult<String> signin() {
        User user = new User();
        return responseService.getSingleResult(jwtTokenProvider.createToken("a1111",user.getRoles()));
    }
}
