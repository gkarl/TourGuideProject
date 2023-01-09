package tourguide.service;

import tourguide.beans.ProviderBean;
import tourguide.beans.VisitedLocationBean;
import tourguide.dto.AllUsersCurrentLocations;
import tourguide.dto.NearByAttractionDto;
import tourguide.user.User;
import tourguide.user.UserReward;

import java.util.List;

public interface TourGuideService {

    VisitedLocationBean getUserLocation(String userName);

    List<NearByAttractionDto> getNearByAttractions(VisitedLocationBean visitedLocationBean, User user);

    List<UserReward> getUserRewards(User user);

    List<AllUsersCurrentLocations> getAllCurrentLocations();

    List<ProviderBean> getTripDeals(User user, int tripDuration, int numberOfAdults, int numberOfChildren);


    List<User> getAllUsers();

    User getUser(String userName);

    void addUser(User user);



    VisitedLocationBean trackUserLocation(User user);





}
