package tourguide.service;

import tourguide.beans.AttractionBean;
import tourguide.beans.LocationBean;
import tourguide.beans.VisitedLocationBean;
import tourguide.user.User;

public interface RewardsService {

    void calculateRewards(User user);

    boolean isWithinAttractionProximity(AttractionBean attractionBean, LocationBean locationBean);

    boolean nearAttraction(VisitedLocationBean visitedLocationBean, AttractionBean attractionBean);

    int getRewardPoints(AttractionBean attractionBean, User user);

    double getDistance(LocationBean loc1, LocationBean loc2);
}
