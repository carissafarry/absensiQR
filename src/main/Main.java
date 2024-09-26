import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Test> listTest = new ArrayList<Test>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Starting the Main program...");
        
        // Directly call the initialize method from Api
        Api.initializeDatabaseConnection(
            "mysql-absensiqr-absensi-qr.g.aivencloud.com",
            "18865",
            "absensiQR",
            "avnadmin",
            "AVNS_A_P4HeqNqLccyRJYGDV"
        );
        
        System.out.println("Finished executing the Main program.");
        
        int choice;
        int no = 1;

        do {
            System.out.println("\n=== Sistem Absensi ===");
            System.out.println("1. Tambah Data Test");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addData(listTest, no);
                    no++;
                    break;
                case 2:
                    viewAllData(listTest);
                    break;
                case 3:
                    System.out.println("Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 3);
    }

    public static void addData(ArrayList<Test> listTest, int no) {
        System.out.print("Masukkan nama ke-" + no + ": ");
        String name = scanner.nextLine();
        listTest.add(new Test(name));
        System.out.println(name + " berhasil ditambahkan.");
    }

    public static void viewAllData(ArrayList<Test> listTest) {
        System.out.println("\nDaftar Kehadiran:");
        for (Test test : listTest) {
            System.out.println("id: " + test.id + " nama: " + test.name);
        }
    }
}