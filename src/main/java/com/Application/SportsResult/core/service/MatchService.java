package com.Application.SportsResult.core.service;

import com.Application.SportsResult.core.model.Match;
import com.Application.SportsResult.core.repository.MatchRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class MatchService {
    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Optional<Match> findById(@PathVariable String id) {
        return matchRepository.findById(id);
    }

    public Optional <Match> findByHomeTeamOrAwayTeam(@PathVariable String homeName, String awayTeam){
        return matchRepository.findByHomeTeamOrAwayTeam(homeName, awayTeam);
    }
//    public Optional <Match> findByGameType
}