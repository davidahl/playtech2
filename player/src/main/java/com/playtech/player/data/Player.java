package com.playtech.player.data;

import com.opencsv.bean.CsvBindByName;

public class Player {

    @CsvBindByName
    private Integer ranking;

    @CsvBindByName
    private Integer seasonId;

    @CsvBindByName
    private Integer playerId;

    @CsvBindByName
    private String firstName;

    @CsvBindByName
    private String lastName;

    @CsvBindByName
    private String teamName;

    @CsvBindByName
    private Integer age;

    @CsvBindByName
    private Integer goal;

    @CsvBindByName
    private String positionText;





    public Player(){
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getGoal() {
        return goal;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPositionText() {
        return positionText;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Integer getSeasonId(){
        return seasonId;
    }

    public String getTeamName() {
        return teamName;
    }
}
