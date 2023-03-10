package hu.alagi.airport.config;

import hu.alagi.airport.service.DefaultDiscountService;
import hu.alagi.airport.service.DiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class DiscountConfiguration {
   @Bean
   public DiscountService discountService() {
      return new DefaultDiscountService();
   }
}
