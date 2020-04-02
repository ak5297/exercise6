import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wombat3 {
   final Logger logger = LoggerFactory.getLogger(Wombat3.class);

   Integer t;
   Integer oldT;
   Double a;
   String s;

   public void setTemperature(Integer temperature) {
      oldT = t;
      t = temperature;
      logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
   
      if(temperature.intValue() > 50) {
         logger.info("Temperature has risen above 50 degrees.");
      }
      if(temperature.intValue() > 75) {
         logger.warn("Temperature has risen above 75 degrees.");
      }
   }
 
 //method 2
   public void setAltitude(Double altitude) {
      a = altitude;
   
      if(altitude.doubleValue() > 1000) {
         logger.error("Altitude has risen above 1000 ft.");
      }
   } 
   
 //method 3
   public void setSeason(String season) {
      s = season;
      if(season.equals("winter")) {
         logger.trace("Season is winter.");
      }     
   }

 
   public static void main(String[] args) {
      Wombat3 kevin = new Wombat3();
      kevin.setTemperature(100);
      kevin.setTemperature(25);
      kevin.setAltitude(1050.31);
      kevin.setSeason("winter");

   }
}
