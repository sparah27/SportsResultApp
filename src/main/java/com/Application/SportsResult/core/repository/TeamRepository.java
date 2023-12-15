package com.Application.SportsResult.core.repository;

import com.Application.SportsResult.core.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TeamRepository extends MongoRepository<Team, String> {

    Optional<Team> findById(String id);

    Optional<Team> findByTeamName(String teamName);

    Optional<Team> findByLeague(String league);
}