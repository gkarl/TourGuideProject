package tourguide.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tourguide.beans.ProviderBean;
import tourguide.beans.VisitedLocationBean;
import tourguide.dto.AllUsersCurrentLocations;
import tourguide.dto.NearByAttractionDto;
import tourguide.service.TourGuideService;
import tourguide.user.User;
import tourguide.user.UserReward;

import java.util.List;

@RestController
public class TourGuideController {

    private final Logger logger = LoggerFactory.getLogger(TourGuideController.class);

    @Autowired

    private TourGuideService tourGuideService;

    @RequestMapping("/")
    public String index() {return "Bienvenu Tourguide"; }

    @ApiOperation(value = "Get user location  by userName")
    @RequestMapping("/getLocation")
    public VisitedLocationBean getLocation(@RequestParam String userName) {
        logger.info("getLocation for userName : " + userName );
        return tourGuideService.getUserLocation(userName);
    }

    @ApiOperation(value = "Get 5 closest attraction from user by userName")
    @RequestMapping("/getNearbyAttractions")
    public List<NearByAttractionDto> getNearbyAttractions(@RequestParam String userName) {
        logger.info("getNearbyAttractions for user : " + userName);
        User user = tourGuideService.getUser(userName);
        VisitedLocationBean visitedLocationBean = tourGuideService.getUserLocation(userName);
        return tourGuideService.getNearByAttractions(visitedLocationBean, user);
    }

    @ApiOperation(value = "Get user rewards by userName")
    @RequestMapping("/getRewards")
    public List<UserReward> getRewards(@RequestParam String userName) {
        logger.info("getRewards for user : " + userName);
        return tourGuideService.getUserRewards(tourGuideService.getUser(userName));
    }


    @ApiOperation(value = "Get all current locations for all users")
    @RequestMapping("/getAllCurrentLocations")
    public List<AllUsersCurrentLocations> getAllCurrentLocations() {
        logger.info("getAllCurrentLocations");
        return tourGuideService.getAllCurrentLocations();
    }

    @ApiOperation(value = "Get user trip deals from his preferences by userName")
    @RequestMapping("/getTripDeals")
    public List<ProviderBean> getTripDeals(@RequestParam String userName, @RequestParam int tripDuration, @RequestParam int numberOfAdults, @RequestParam int numberOfChildren) {
        logger.info("getTripDeals from user preferences : " + userName + tripDuration + numberOfAdults + numberOfChildren);
        List<ProviderBean> providerBeans = tourGuideService.getTripDeals(tourGuideService.getUser(userName), tripDuration, numberOfAdults, numberOfChildren);
        return providerBeans;
    }

}
