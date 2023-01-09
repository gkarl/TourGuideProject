package tourguide.user;

import tourguide.beans.AttractionBean;
import tourguide.beans.VisitedLocationBean;

public class UserReward {

    public final VisitedLocationBean visitedLocationBean;
    public final AttractionBean attractionBean;
    private int rewardPoints;

    public UserReward(VisitedLocationBean visitedLocationBean, AttractionBean attractionBean, int rewardPoints) {
        this.visitedLocationBean = visitedLocationBean;
        this.attractionBean = attractionBean;
        this.rewardPoints = rewardPoints;
    }

    public UserReward(VisitedLocationBean visitedLocationBean, AttractionBean attractionBean) {
        this.visitedLocationBean = visitedLocationBean;
        this.attractionBean = attractionBean;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public VisitedLocationBean getVisitedLocationBean() {
        return visitedLocationBean;
    }

    public AttractionBean getAttractionBean() {
        return attractionBean;
    }
}
