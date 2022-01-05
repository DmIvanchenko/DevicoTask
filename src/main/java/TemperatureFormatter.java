import java.util.Scanner;

public class TemperatureFormatter {
    public double formatChecker(String str, double t){
        if (str.charAt(0)!='+' && str.charAt(0)!= '-' && str.charAt(str.length()-1)!= 'C'){
            System.out.println("Неправильный формат ввода. необходимо ввести строку в формате +NС\n"
            + "где N - абсолютное значение температуры, + или - являются обязательными параметрами");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            formatChecker(str, t);
        } else {
            t = formatter(str);
        }
        return t;
    }

    public double formatter(String str){

        if (str.charAt(0) == '+'){
            str = removeCharAt(str, 0);
            str = removeCharAt(str, str.length()-1);
        } else{
            str = removeCharAt(str, str.length()-1);
        }
        double temperature = Double.parseDouble(str);
        return temperature;
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }


}
