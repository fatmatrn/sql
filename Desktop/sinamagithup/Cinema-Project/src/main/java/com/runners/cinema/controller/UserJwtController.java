package com.runners.cinema.controller;

import com.runners.cinema.dto.request.RegisterRequest;
import com.runners.cinema.dto.response.CinemaResponse;
import com.runners.cinema.dto.response.ResponseMessage;
import com.runners.cinema.security.jwt.JwtUtils;
import com.runners.cinema.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserJwtController {



    private final JwtUtils jwtUtils;


    private final UserService userService;

   private final AuthenticationManager authenticationManager;

    public UserJwtController(JwtUtils jwtUtils, UserService userService, AuthenticationManager authenticationManager) {
        this.jwtUtils = jwtUtils;
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }


    @PostMapping("/register")
    public ResponseEntity<CinemaResponse>  register(@Valid @RequestBody RegisterRequest registerRequest){
     userService.save(registerRequest);

     CinemaResponse response = new CinemaResponse();
     response.setMessage(ResponseMessage.REGISTERED_SUCCESSFULLY);
     response.setSuccess(true);
     return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
