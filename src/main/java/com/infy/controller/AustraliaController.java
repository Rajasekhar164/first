package com.infy.controller;
import com.infy.model.Australia;
import com.infy.repo.AustraliaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AustraliaController {
    @Autowired
    AustraliaRepo repo;

    @PostMapping("/save/austrlia")
    public String saveAustralia(@RequestBody Australia request) {

        Australia obj = new Australia();
        obj.setTeamRank(request.getTeamRank());
        obj.setTeamNickName(request.getTeamNickName());
        obj.setTeamPosition(request.getTeamPosition());
        obj.setTeamSalary(request.getTeamSalary());
        repo.save(obj);

        return "saved success";

    }
@GetMapping("/get-all")
 public List<Australia> getAllAustalia() {
    List<Australia> ref= repo.findAll();
        return  ref;
    }
}