package tourguide.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tourguide.beans.AttractionBean;
import tourguide.beans.VisitedLocationBean;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "GpsUtil-microservice", url = "localhost:8001")
public interface GpsUtilProxy {

    @GetMapping(value = "/gpsUtil/getUserLocation/{userId}")
    VisitedLocationBean getUserLocation(@PathVariable("userId") UUID userId);

    @GetMapping(value = "/gpsUtil/getAttractions")
    List<AttractionBean> getAttractions();
}
