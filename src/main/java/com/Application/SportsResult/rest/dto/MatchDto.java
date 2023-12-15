package com.Application.SportsResult.rest.dto;

import com.Application.SportsResult.core.model.enums.MatchType;


import java.sql.Time;
import java.util.Date;

public class MatchDto {

    private String homeTeam;
    private String awayTeam;
    private Date date;
    private Time time;
    private MatchType matchType;
    private String result;
}
