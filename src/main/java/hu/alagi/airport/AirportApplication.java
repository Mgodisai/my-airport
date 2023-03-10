package hu.alagi.airport;

import hu.alagi.airport.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportApplication implements CommandLineRunner {

   @Autowired
   private PriceService priceService;

   public static void main(String[] args) {
      SpringApplication.run(AirportApplication.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
      System.out.println(priceService.getFinalPrice(200));
      System.out.println(priceService.getFinalPrice(20000));
   }
}
