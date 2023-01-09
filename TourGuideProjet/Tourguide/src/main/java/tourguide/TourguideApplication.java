package tourguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Locale;

@SpringBootApplication
@EnableFeignClients("tourguide")
public class TourguideApplication {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));
		SpringApplication.run(TourguideApplication.class, args);
	}

}
