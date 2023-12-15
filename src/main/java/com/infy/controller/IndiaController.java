package com.infy.controller;
import com.infy.model.Australia;
import com.infy.model.India;
import com.infy.repo.IndiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndiaController {
    @Autowired
    IndiaRepo repo;

    @PostMapping("/save/india")
    public String saveIndia(@RequestBody India request) {

        India obj = new India();
        obj.setTeamRank(request.getTeamRank());
        obj.setTeamNickName(request.getTeamNickName());
        obj.setTeamPosition(request.getTeamPosition());
        obj.setTeamSalary(request.getTeamSalary());
        repo.save(obj);


        return "saved success";
    }
    @GetMapping("/get-all/india")
    public List<India> getAllIndia() {
        List<India> ref= repo.findAll();
        return ref;
    }
}

