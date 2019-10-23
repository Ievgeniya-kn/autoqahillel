package homework02;

public class TemperatureConverter {
    public static void main(String[] args) {

        double celsius = 15;
        double fahrenheit = 98;

        double converterKelvin, converterCelsius, converterFahrenheit;

        //1
        converterFahrenheit = celsius * (9.0 / 5) + 32;
        System.out.println("Convert Celsius " + celsius + "C into Fahrenheit: " + converterFahrenheit + " F");

        //2
        converterCelsius = (fahrenheit - 32) * (5.0 / 9);
        System.out.println("Convert Farenheit " + fahrenheit + "F into Celsius: " + converterCelsius + " C");

        //3
        converterKelvin = celsius + 273.16;
        System.out.println("Convert Celsius " + celsius + "C into Kelvin: " + converterKelvin + " K");
    }
}
