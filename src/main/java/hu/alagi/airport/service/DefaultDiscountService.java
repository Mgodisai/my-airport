package hu.alagi.airport.service;

import hu.alagi.airport.config.AirportConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultDiscountService implements DiscountService {

   @Autowired
   AirportConfigProperties airportConfigProperties;
   @Override
   public int getDiscountPercent(int totalPrice) {
      return airportConfigProperties.getDiscount().getDef().getPercent();
   }
}
