package com.Application.SportsResult.core.service;

import com.Application.SportsResult.core.model.Team;
import com.Application.SportsResult.core.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> findAll(){
        return teamRepository.findAll();
    }

    public Optional<Team> findById(@PathVariable String id){
        return teamRepository.findById(id);
    }

    public Optional<Team> findByTeamName(@PathVariable String teamName){
        return teamRepository.findByTeamName(teamName);
    }
}
