package com.badgeorama.adalovelace.badgegenerator.Controllers;


import com.badgeorama.adalovelace.badgegenerator.dataservice.BadgeService;
import com.badgeorama.adalovelace.badgegenerator.model.Badge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/badge")
public class BadgeGeneratorController {


    private final BadgeService badgeService;

    public BadgeGeneratorController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }


    @PostMapping("/add")
    public void addBadge(@RequestBody Badge badge){
        badgeService.createBadge(badge);
    }


}
