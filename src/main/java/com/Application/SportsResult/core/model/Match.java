package com.Application.SportsResult.core.model;

import com.Application.SportsResult.core.model.enums.MatchType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.util.Date;
@Document("matches")
public class Match {
    @Id
    private String id;
    private String homeTeam;
    private String awayTeam;
    private Date date;
    private Time time;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public MatchType getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(MatchType matchtype) {
        this.matchtype = matchtype;
    }

    private MatchType matchtype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
