package com.infy.controller;
import com.infy.model.India;
import com.infy.model.Pakistan;
import com.infy.repo.PakistanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PakistanController {
@Autowired
    PakistanRepo repo;

    @PostMapping("/save/pakistan")
    public String savePakistan(@RequestBody Pakistan request) {

        Pakistan obj =  new Pakistan();
        obj.setTeamRank(request.getTeamRank());
        obj.setTeamNickName(request.getTeamNickName());
        obj.setTeamPosition(request.getTeamPosition());
        obj.setTeamSalary(request.getTeamSalary());
        repo.save(obj);


        return "saved success";
    }
    @GetMapping("/get-all/pakistan")
    public List<Pakistan> getPakistan() {
        List<Pakistan> ref= repo.findAll();
        return ref;
    }
}
