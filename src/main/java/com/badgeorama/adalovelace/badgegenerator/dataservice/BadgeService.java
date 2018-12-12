package com.badgeorama.adalovelace.badgegenerator.dataservice;


import com.badgeorama.adalovelace.badgegenerator.model.Badge;
import com.badgeorama.adalovelace.badgegenerator.repository.BadgeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BadgeService {

    @Autowired
    BadgeRepo badgeRepo;

    public void createBadge(Badge badge){   badgeRepo.save(badge);}

}
