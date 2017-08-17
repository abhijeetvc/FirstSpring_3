package com.example.FirstSpring.controller;

import com.example.FirstSpring.impl.MyImpl;
import com.example.FirstSpring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhi on 10/08/17.
 */

@RestController
public class MyController {

    @Autowired
    MyImpl myImpl;

    @GetMapping(value="/add/{a}/{b}")
    Integer add(@PathVariable Integer a, @PathVariable Integer b){

        return a+b;
    }

    @GetMapping(value="/getresult/{a}/{b}")
    public ResponseEntity<?> getResult(@PathVariable Integer a,@PathVariable Integer b){

        Integer data=myImpl.add(a,b);

        Map<String,Object> map=new HashMap();
        map.put("value",data);
                                        //ResponseEntity.ok(data);
        ResponseEntity<?> entity=new ResponseEntity(map, HttpStatus.OK);
        return entity;
    }

    @PostMapping(value="/getstudent")
    public ResponseEntity<?> getData(@RequestBody Student student){

        ResponseEntity<String> entity=ResponseEntity.ok("Data saved");
        return entity;
    }
}
