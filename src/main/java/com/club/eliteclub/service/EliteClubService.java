package com.club.eliteclub.service;

import com.club.eliteclub.dao.EliteClubRepository;
import com.club.eliteclub.entity.EliteClub;
import com.club.eliteclub.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EliteClubService {

    private EliteClubRepository eliteClubRepository;

    @Autowired
    public void setEliteClubRepository(EliteClubRepository eliteClubRepository) {
        this.eliteClubRepository = eliteClubRepository;
    }

    public List<Club> getAll() {
        return eliteClubRepository.findAll().stream().map(c -> new Club(c.getClubName())).collect(Collectors.toList());
    }

    public void addClub(String... clubNames) {
        for (String clubName : clubNames) {
            EliteClub eliteClub = new EliteClub();
            eliteClub.setClubName(clubName);
            eliteClubRepository.save(eliteClub);
        }
    }
}
