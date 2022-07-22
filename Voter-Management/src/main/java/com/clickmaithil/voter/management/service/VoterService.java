package com.clickmaithil.voter.management.service;

import com.clickmaithil.voter.management.common.GenericResponse;
import com.clickmaithil.voter.management.entity.Voter;
import com.clickmaithil.voter.management.repo.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoterService {

    @Autowired
    VoterRepo voterRepo;

    public GenericResponse addNewVoter(Voter voter){
      return  new GenericResponse("Voter added successfully",1,voterRepo.save(voter));
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
