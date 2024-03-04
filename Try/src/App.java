import java.util.*;

public class App {

    public void initAll(int pilihan, double value) {
        Scanner scanner = new Scanner(System.in);
        switch (pilihan) {
            case 1:
                System.out.println("| Dari Fahrenheit ke:");
                System.out.println("| 1. Celcius");
                System.out.println("| 2. Reamur");
                System.out.println("| 3. Kelvin");
                System.out.print("Pilihan: ");
                int pilihanFahrenheit = scanner.nextInt();
                Suhu.Fahrenheit.initAll(pilihanFahrenheit, value);
                break;
            case 2:
                System.out.println("| Dari Reamur ke:");
                System.out.println("| 1. Celcius");
                System.out.println("| 2. Fahrenheit");
                System.out.println("| 3. Kelvin");
                System.out.print("Pilihan: ");
                int pilihanReamur = scanner.nextInt();
                Suhu.Reamur.initAll(pilihanReamur, value);
                break;
            case 3:
                System.out.println("| Dari Kelvin ke:");
                System.out.println("| 1. Celcius");
                System.out.println("| 2. Fahrenheit");
                System.out.println("| 3. Reamur");
                System.out.print("Pilihan: ");
                int pilihanKelvin = scanner.nextInt();
                Suhu.Kelvin.initAll(pilihanKelvin, value);
                break;
            case 4:
                System.out.println("| Dari Celcius ke:");
                System.out.println("| 1. Fahrenheit");
                System.out.println("| 2. Reamur");
                System.out.println("| 3. Kelvin");
                System.out.print("Pilihan: ");
                int pilihanCelcius = scanner.nextInt();
                Suhu.Celcius.initAll(pilihanCelcius, value);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = new App();
        System.out.println("|----------[Konversi Suhu]----------|");
        System.out.println("| Pilih satuan suhu yang akan diubah:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.println("4. Celcius");
        System.out.println("|----------------------------------|");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        System.out.print("Masukkan nilai suhu:");

        double value = scanner.nextDouble();
        app.initAll(pilihan, value);

        scanner.close();
    }
}
 