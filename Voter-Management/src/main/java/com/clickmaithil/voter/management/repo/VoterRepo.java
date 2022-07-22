package com.clickmaithil.voter.management.repo;

import com.clickmaithil.voter.management.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepo extends JpaRepository<Voter, Long> {
}
