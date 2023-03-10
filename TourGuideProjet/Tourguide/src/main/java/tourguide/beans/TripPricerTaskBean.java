package tourguide.beans;

import java.util.UUID;

public class TripPricerTaskBean {

    private UUID attractionId;
    private String apiKey;
    private int    adults;
    private int    children;
    private int    nightsStay;

    public TripPricerTaskBean(UUID attractionId, String apiKey, int adults, int children, int nightsStay) {
        this.attractionId = attractionId;
        this.apiKey = apiKey;
        this.adults = adults;
        this.children = children;
        this.nightsStay = nightsStay;
    }

    public TripPricerTaskBean() {
    }

    public UUID getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(UUID attractionId) {
        this.attractionId = attractionId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getNightsStay() {
        return nightsStay;
    }

    public void setNightsStay(int nightsStay) {
        this.nightsStay = nightsStay;
    }

    @Override
    public String toString() {
        return "TripPricerTaskBean{" +
                "attractionId=" + attractionId +
                ", apiKey='" + apiKey + '\'' +
                ", adults=" + adults +
                ", children=" + children +
                ", nightsStay=" + nightsStay +
                '}';
    }
}
