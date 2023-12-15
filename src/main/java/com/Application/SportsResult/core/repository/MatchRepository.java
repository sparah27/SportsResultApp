package com.Application.SportsResult.core.repository;

import com.Application.SportsResult.core.model.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface MatchRepository extends MongoRepository<Match, String> {
        Optional<Match> findMatchById(String id);
        Optional<Match> findAllByDate(Date date);
        Optional<Match> findByHomeTeamOrAwayTeam(String homeTeam, String awayTeam);
}
