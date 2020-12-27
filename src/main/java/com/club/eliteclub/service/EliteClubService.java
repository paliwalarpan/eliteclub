package com.club.eliteclub.service;

import com.club.eliteclub.model.Club;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class EliteClubService {

    public List<Club> getAll(){
        return Arrays.asList(new Club("Billionaire"),
                new Club("Environmentalist"),new Club("soccer"));
    }
}
