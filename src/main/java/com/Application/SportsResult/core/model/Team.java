package com.Application.SportsResult.core.model;


import com.Application.SportsResult.core.model.enums.TeamType;
import org.springframework.data.annotation.Id;

public class Team {
    @Id
    private String id;
    private String teamName;
    private String league;
    private TeamType teamType;

//    public Team(String id, String teamName, String league){
//        this.id = id;
//        this.teamName = teamName;
//        this.league = league;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public TeamType getTeamType() {
        return teamType;
    }

    public void setTeamType(TeamType teamType) {
        this.teamType = teamType;
    }
}
