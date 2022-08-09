package com.example.day1ex;

import org.springframework.web.bind.annotation.*;

@RestController
public class welcomeController {
//GET /hey : returns “Hey from spring
@GetMapping("/hey")
public  String getHey (){
    return "Hey from spring";
}
// GET /bye : returns “Bye” GET /check/status : returns “Everything OK”
    @GetMapping("/Bye")
    public String getBye(){
    return "Bye";
    }
    @GetMapping("check/status")
    public String getCheckstatus(){
    return "Everything ok";
    }
    //GET /health : returns “Server health is up and running”
    @GetMapping("health")
    public String getHealth(){
    return "Server health is up and running";
    }


}
