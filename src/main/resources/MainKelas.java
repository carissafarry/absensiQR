import java.util.Scanner;

public class MainKelas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KelasManager manager = new KelasManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kelas");
            System.out.println("2. Perbarui Kelas");
            System.out.println("3. Hapus Kelas");
            System.out.println("4. Tampilkan Kelas");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (option) {
                case 1:
                    System.out.print("ID Kelas: ");
                    int idkelas = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    System.out.print("Nama Kelas: ");
                    String nama = scanner.nextLine();
                    System.out.print("Angkatan: ");
                    String angkatan = scanner.nextLine();
                    manager.addKelas(new Kelas(idkelas, nama, angkatan));
                    break;
                case 2:
                    System.out.print("ID Kelas yang akan diperbarui: ");
                    idkelas = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    System.out.print("Nama Kelas Baru: ");
                    nama = scanner.nextLine();
                    System.out.print("Angkatan Baru: ");
                    angkatan = scanner.nextLine();
                    manager.updateKelas(idkelas, nama, angkatan);
                    break;
                case 3:
                    System.out.print("ID Kelas yang akan dihapus: ");
                    idkelas = scanner.nextInt();
                    manager.deleteKelas(idkelas);
                    break;
                case 4:
                    System.out.println("Daftar Kelas:");
                    manager.viewKelas();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }
    }
}