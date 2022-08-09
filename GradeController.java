package com.example.day1ex;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {
    ArrayList<Integer> Grade = new ArrayList<>();
    // GET /grade : returns all grades
    @GetMapping("/grade")
    public ArrayList gerGrade(){
        return Grade;
    }
    //POST /grade : posts new grade
    @PostMapping("/grade")
    public String addGrade(@RequestBody int grade){
        Grade.add(grade);
        return "posts new grade";
    }
    //PUT /grade : updates grade
    @PutMapping("/grade/{index}")
    public String update(@PathVariable int index , @RequestBody int grade){
        Grade.set(index,grade);
        return "updates grade";
    }
    //DELETE/grade : deletes grade
    @DeleteMapping("/grade/{index}")
    public String delete(@PathVariable int index){
        Grade.remove(index);
        return "deletes grade";
    }

}
