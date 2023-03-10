package hu.alagi.airport.config;

import hu.alagi.airport.service.DiscountService;
import hu.alagi.airport.service.SpecialDiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDiscountConfiguration {
   @Bean
   public DiscountService discountService() {
      return new SpecialDiscountService();
   }
}
