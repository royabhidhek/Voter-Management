package com.example.Voter.Management.service;

import com.example.Voter.Management.common.GenericResponse;
import com.example.Voter.Management.entity.Voter;
import com.example.Voter.Management.repo.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoterService {

    @Autowired
    VoterRepo voterRepo;

    public Voter addNewVoter(Voter voter){

      return  voterRepo.save(voter);
    }

    public List<Voter> getAllVoter()
    {
        List<Voter> voter = new ArrayList<Voter>();
        voterRepo.findAll().forEach(voter1-> voter.add(voter1));
        return voter;
    }

    public GenericResponse getVoterById(int id)
    {
        return new GenericResponse("Voter fetched successfully",1,voterRepo.findById((long) id).get());

    }

    public GenericResponse updateById(Voter voterid) {
        return new GenericResponse("Voter updated successfully",1,voterRepo.save(voterid));

    }

    public GenericResponse deleteById(int voterid) {
        voterRepo.deleteById((long) voterid);
        return new GenericResponse("Voter deleted successfully",1,null);
    }

    public void deleteAll() {
        voterRepo.deleteAll();
    }
}
