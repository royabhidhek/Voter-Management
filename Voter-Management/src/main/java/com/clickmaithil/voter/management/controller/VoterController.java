package com.clickmaithil.voter.management.controller;

import com.clickmaithil.voter.management.common.GenericResponse;
import com.clickmaithil.voter.management.entity.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.clickmaithil.voter.management.service.VoterService;

import java.util.List;

@RestController
public class VoterController {

    @Autowired
    VoterService voterService;


    @PostMapping( "/voter")
    GenericResponse addNewVoter(@RequestBody Voter newVoter) {
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
