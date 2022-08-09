package com.example.day1ex;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {
   // ArrayList<String> todos=new ArrayList<>();
    ArrayList<String> todos = new ArrayList<>();


    //  @RequestMapping(path = "/todo",method = RequestMethod.GET)
    @GetMapping("/todo")
    public ArrayList getTodos(){
        return todos;
    }

    //  @RequestMapping(path = "/todo",method = RequestMethod.POST)
    @PostMapping("/todo")
    public String addTodo(@RequestBody String todo){
        todos.add(todo);
        return "New todo added to the list";
    }

    // @RequestMapping(path = "/todo",method = RequestMethod.PUT)
    @PutMapping("/todo/{index}")
    public String updateTodo(@PathVariable int index,@RequestBody String name){
        todos.set(index,name);
        return "Todo updated";
    }


    //@RequestMapping(path = "/todo/{index}",method = RequestMethod.DELETE)
    @DeleteMapping("/todo/{index}")
    public String deleteTodo(@PathVariable int index){
        todos.remove(index);
        return "Todo deleted from the list";
    }




}
