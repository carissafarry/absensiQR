import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Test> listTest = new ArrayList<Test>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            
        int choice; //tipe data integer
        int no = 1; //tipe data integer

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
                    no++; // operators unary (increment)
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
        } while (choice != 3); // relational yang mengakibatkan looping disini
    }

    public static void addData(ArrayList<Test> listTest, int no) { // data masuk disimpan pada urutan array
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