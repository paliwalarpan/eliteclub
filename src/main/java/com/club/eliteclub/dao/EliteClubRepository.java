package com.club.eliteclub.dao;

import com.club.eliteclub.entity.EliteClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EliteClubRepository extends JpaRepository<EliteClub, Long> {
}
