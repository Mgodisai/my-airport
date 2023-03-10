package hu.alagi.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

   private final DiscountService discountService;

   public PriceService(@Autowired DiscountService discountService) {
      this.discountService = discountService;
   }
   public int getFinalPrice(int price) {
      return (int)(price * (1-discountService.getDiscountPercent(price)/100.0));
   }
}
