package tourguide.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tourguide.exception.CustomErrorDecoder;

@Configuration
public class FeignExceptionConfig {

    @Bean
    public CustomErrorDecoder customErrorDecoder() {
        return new CustomErrorDecoder();
    }
}
