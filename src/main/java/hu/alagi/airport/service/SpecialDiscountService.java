package hu.alagi.airport.service;

import hu.alagi.airport.config.AirportConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialDiscountService extends DefaultDiscountService {
   @Autowired
   AirportConfigProperties airportConfigProperties;
   @Override
   public int getDiscountPercent(int totalPrice) {
      return totalPrice>airportConfigProperties.getDiscount().getSpecial().getLimit()
            ? airportConfigProperties.getDiscount().getSpecial().getPercent()
            : super.getDiscountPercent((totalPrice));
   }
}
