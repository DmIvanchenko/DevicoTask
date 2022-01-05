import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        TemperatureFormatter formatter = new TemperatureFormatter();
        TemperatureHandler temperatureHandler = new TemperatureHandler();
        Scanner scanner = new Scanner(System.in);
        String temperature = scanner.nextLine();
        double value = 0;
        double temperatureValue = formatter.formatChecker(temperature,  value);
        System.out.println(temperatureHandler.handler(temperatureValue));

    }
}
