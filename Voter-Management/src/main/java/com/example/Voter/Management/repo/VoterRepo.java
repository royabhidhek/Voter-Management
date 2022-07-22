package com.example.Voter.Management.repo;

import com.example.Voter.Management.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepo extends JpaRepository<Voter, Long> {
}
