package tripPricer.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {TripPricerServiceImpl.class})
@ExtendWith(SpringExtension.class)
public class TripPricerServiceTest {

    @Autowired
    private TripPricerServiceImpl tripPricerServiceImpl;

    @Test
    @DisplayName("getPriceTest")
    public void getPriceTest() {
        UUID randomUUIDResult = UUID.randomUUID();
        List<Provider> actualPrice = this.tripPricerServiceImpl.getPrice("Api Key", randomUUIDResult, 1, 1, 1, 1);
        assertEquals(5, actualPrice.size());
    }
}
