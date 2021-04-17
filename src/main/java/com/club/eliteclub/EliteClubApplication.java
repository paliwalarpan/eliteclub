package com.club.eliteclub;

import com.club.eliteclub.model.ClubDTO;
import com.club.eliteclub.service.EliteClubService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class EliteClubApplication implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(EliteClubApplication.class);

    @Autowired
    private EliteClubService eliteClubService;

    public static void main(String[] args) {
        SpringApplication.run(EliteClubApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eliteClubService.addClub("Billionaire", "Environmentalist", "Poker");
        List<ClubDTO> clubs = eliteClubService.searchClub("Bi");
        LOG.info("Search Result : {}", clubs);
    }
}
