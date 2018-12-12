package com.badgeorama.adalovelace.badgegenerator;


import com.badgeorama.adalovelace.badgegenerator.Controllers.BadgeGeneratorController;
import com.badgeorama.adalovelace.badgegenerator.dataservice.BadgeService;
import com.badgeorama.adalovelace.badgegenerator.model.Badge;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@SpringBootTest
public class BadgeGeneratorTest {


    private BadgeService badgeServiceMock= mock(BadgeService.class);


    @Test
    public void  addBadgeInfo(){

        //setup
        BadgeGeneratorController badgeGeneratorController=new BadgeGeneratorController(badgeServiceMock);
        Badge badge =new Badge();

        //execute

        badgeGeneratorController.addBadge(badge);
        verify(badgeServiceMock,times(1)).createBadge(badge);


    }
}
