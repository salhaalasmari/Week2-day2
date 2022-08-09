package com.example.day1ex;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {

    ArrayList<String> person=new ArrayList<>();
    //GET /name : returns all names
    @GetMapping("/name")
    public ArrayList getNames(){
        return person ;
    }
    //POST /name : posts new name
    @PostMapping("/name")
    public String createPersone(@RequestBody String name){
        person.add(name);
        return "posts new name\n";
    }
    //PUT /name : updates name
    @PutMapping("/name/{index}")
    public String update(@PathVariable int index , @RequestBody String name){
        person.set(index,name);
        return "updates name";
    }
    //DELETE/name : deletes name
    @DeleteMapping("/name/{index}")
    public String delete(@PathVariable int index){
        person.remove(index);
        return "deletes name";
    }




}
