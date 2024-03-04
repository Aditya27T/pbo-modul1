package Suhu;

public class Fahrenheit {
    public static void toCelcius(double value) {
        double result = (value - 32) * 5/9;
        System.out.println(value + " F = " + result + " C");
    }

    public static void toReamur(double value) {
        double result = (value - 32) * 4/9;
        System.out.println(value + " F = " + result + " R");
    }

    public static void toKelvin(double value) {
        double result = (value - 32) * 5/9 + 273.15;
        System.out.println(value + " F = " + result + " K");
    }

    public static void initAll(int pilihan, double value) {
        switch (pilihan) {
            case 1:
                toCelcius(value);
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
