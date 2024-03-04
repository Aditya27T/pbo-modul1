package Suhu;
public class Kelvin {
    public static void toCelcius(double value) {
        double result = value - 273.15;
        System.out.println(value + " K = " + result + " C");
    }

    public static void toFahrenheit(double value) {
        double result = (value - 273.15) * 9/5 + 32;
        System.out.println(value + " K = " + result + " F");
    }

    public static void toReamur(double value) {
        double result = (value - 273.15) * 4/5;
        System.out.println(value + " K = " + result + " R");
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
                toReamur(value);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
