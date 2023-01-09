package tourguide.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tourguide.proxies.GpsUtilProxy;
import tourguide.proxies.RewardsProxy;
import tourguide.proxies.TripPricerProxy;
import tourguide.service.RewardsServiceImpl;

@Configuration
public class TourGuideModule {

    @Autowired
    GpsUtilProxy gpsUtilProxy;

    @Autowired
    RewardsProxy rewardsProxy;

    @Autowired
    TripPricerProxy tripPricerProxy;

    @Bean
    public RewardsServiceImpl getRewardsService() {
        return new RewardsServiceImpl(gpsUtilProxy, rewardsProxy);
    }


}
