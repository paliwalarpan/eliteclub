package com.club.eliteclub.model;

import java.io.Serializable;

public class ClubDTO implements Serializable {
    private final String clubName;

    public ClubDTO(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }
}
