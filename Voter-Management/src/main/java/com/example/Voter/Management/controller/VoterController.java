package com.example.Voter.Management.controller;

import com.example.Voter.Management.common.GenericResponse;
import com.example.Voter.Management.entity.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Voter.Management.service.VoterService;

import java.util.List;

@RestController
public class VoterController {

    @Autowired
    VoterService voterService;


    @PostMapping("/voter")
    Voter addNewVoter(@RequestBody Voter newVoter) {
        return voterService.addNewVoter(newVoter);
    }

    @GetMapping("/voter")
    private List<Voter> getAllVoter() {
        return voterService.getAllVoter();
    }

    @GetMapping("/voter/{voterid}")
    private GenericResponse getVoterById(@PathVariable("voterid") int voterid) {
        return voterService.getVoterById(voterid);
    }

    @PutMapping("voter/{voterid}")
    private GenericResponse updateById(@PathVariable("voterid") Voter voterid) {
        return voterService.updateById(voterid);
    }

    @DeleteMapping("voter/{voterid}")
    private GenericResponse DeleteById(@PathVariable int voterid) {
        return voterService.deleteById(voterid);
    }
    @DeleteMapping("voter/All")
    private void deleteAll(){
         voterService.deleteAll();
    }
}
