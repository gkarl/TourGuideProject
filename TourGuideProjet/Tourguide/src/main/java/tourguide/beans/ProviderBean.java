package tourguide.beans;

import java.util.UUID;

public class ProviderBean {

    private UUID tripId;
    private String name;
    private double price;

    public ProviderBean(UUID tripId, String name, double price) {
        this.tripId = tripId;
        this.name = name;
        this.price = price;
    }

    public ProviderBean() {
    }

    public UUID getTripId() {
        return tripId;
    }

    public void setTripId(UUID tripId) {
        this.tripId = tripId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProviderBean{" +
                "tripId=" + tripId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
