package com.club.eliteclub.service;

import com.club.eliteclub.model.ClubDTO;

import java.util.List;

public interface EliteClubService {

    List<ClubDTO> getAll();

    List<ClubDTO> searchClub(String searchTerm);

    void addClub(String... clubNames);

    ClubDTO getByID(long clubId);

    void deleteClub(long clubId);

    ClubDTO updateClub(long clubId, ClubDTO updatedClub);


}
