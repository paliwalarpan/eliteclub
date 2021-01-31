package com.club.eliteclub.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ClubDTO implements Serializable {
    private final String clubName;

    @JsonCreator
    public ClubDTO(@JsonProperty("clubName") String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    @Override
    public String toString() {
        return "ClubDTO{" +
                "clubName='" + clubName + '\'' +
                '}';
    }
}
