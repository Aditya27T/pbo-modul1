import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("                 IDENTITAS DIRI                  ");
        System.out.println("**************************************************");
        System.out.print("Nama Lengkap      : ");
        String nama = input.nextLine();
        System.out.print("NIM             : "); 
        String nim = input.nextLine();
        System.out.print("Program Studi    : ");
        String prodi = input.nextLine();
        System.out.print("Offering         : ");
        String offering = input.nextLine();
        System.out.print("Universitas      : ");
        String universitas = input.nextLine();
        System.out.println("**************************************************");

        input.close();

        System.out.println("Nama saya" + nama + ". saya adalah mahasiswa " +universitas+ " dengan NIM " +nim+ ". Saya mengambil program studi " +prodi+ " dengan offering " +offering+ ".");
    }
}
