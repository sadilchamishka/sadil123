package com.sadil.chamishka;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    private HomeService homeService=new HomeService();

    @GetMapping
    public ResponseEntity<String> home(){
        return new ResponseEntity<>(homeService.getHome(), HttpStatus.OK);
    }
}
