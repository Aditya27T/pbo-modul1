package Suhu;

public class Reamur {
    public static void toCelcius(double value) {
        double result = value * 5/4;
        System.out.println(value + " R = " + result + " C");
    }

    public static void toFahrenheit(double value) {
        double result = (value * 9/4) + 32;
        System.out.println(value + " R = " + result + " F");
    }

    public static void toKelvin(double value) {
        double result = (value * 5/4) + 273.15;
        System.out.println(value + " R = " + result + " K");
    }
    
    public static void initAll(int pilihan, double value) {
        switch (pilihan) {
            case 1:
                toCelcius(value);
                break;
            case 2:
                toFahrenheit(value);
                break;
            case 3:
                toKelvin(value);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
