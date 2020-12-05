package com.bootcamp.restDemo.controller;

import com.bootcamp.restDemo.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    public static List<Person> dataPerson = new ArrayList<>();

    @GetMapping
    public List<Person> get(){
        return dataPerson;
    }

    @GetMapping(value = "/{id}")
    public Person getById(@PathVariable int id){
        Person person = dataPerson.stream()
                        .filter(x -> x.getId() == id)
                        .findFirst()
                        .orElse(null);
        return person;
    }

    @PostMapping
    public List<Person> save(@RequestBody Person data){
        dataPerson.add(data);
        return dataPerson;
    }
}
