package Suhu;

public class Celcius {
    public static void toFahrenheit(double value) {
        double result = (value * 9/5) + 32;
        System.out.println(value + " C = " + result + " F");
    }

    public static void toReamur(double value) {
        double result = value * 4/5;
        System.out.println(value + " C = " + result + " R");
    }

    public static void toKelvin(double value) {
        double result = value + 273.15;
        System.out.println(value + " C = " + result + " K");
    }

    public static void initAll(int pilihan, double value) {
        switch (pilihan) {
            case 1:
                toFahrenheit(value);
                break;
            case 2:
                toReamur(value);
                break;
            case 3:
                toKelvin(value);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
