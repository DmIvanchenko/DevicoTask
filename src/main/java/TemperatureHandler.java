public class TemperatureHandler {
    public String handler(double temperature){
        String res;
        if (temperature >= -50 && temperature <= -1){
            res ="It’s super cold today. Be sure you dress well!";
            return res;
        } else if(temperature >= 0 && temperature <= 10){
           res = "It’s windy outside, but we are sure you will enjoy your day!";
           return res;
        } else if (temperature >= 11 && temperature <= 30){
            res ="It’s time for outdoor walking!";
            return res;
        } else if (temperature >= 31 && temperature <= 40){
          res ="It's so hot outside!";
          return res;
        } else if (temperature >= 41 && temperature <= 50){
            res =("Welcome to hell!");
            return res;
        } else{
           res =("Please re-check results in 5 mins");
           return res;
        }
    }
}
