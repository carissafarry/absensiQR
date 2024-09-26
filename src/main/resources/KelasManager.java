import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class KelasManager {
    private ArrayList<Kelas> daftarKelas;
    
    public KelasManager() {
        static ArrayList<Kelas> daftarKelas = new ArrayList<Kelas>();
        
    }

    // Menambah kelas baru
    public void addKelas(Kelas kelas) {
        daftarKelas.add(kelas);
        System.out.println("Kelas berhasil ditambahkan.");
    }

    // Memperbarui kelas berdasarkan idkelas
    public void updateKelas(int idkelas, String nama, String angkatan) {
        for (Kelas kelas : daftarKelas) {
            if (kelas.getIdKelas() == idkelas) {
                kelas.setNama(nama);
                kelas.setAngkatan(angkatan);
                System.out.println("Kelas berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Kelas dengan ID " + idkelas + " tidak ditemukan.");
    }

    // Menghapus kelas berdasarkan idkelas
    public void deleteKelas(int idkelas) {
        for (Kelas kelas : daftarKelas) {
            if (kelas.getIdKelas() == idkelas) {
                daftarKelas.remove(kelas);
                System.out.println("Kelas berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kelas dengan ID " + idkelas + " tidak ditemukan.");
    }

    // Menampilkan semua kelas
    public void viewKelas() {
        if (daftarKelas.isEmpty()) {
            System.out.println("Tidak ada kelas yang tersedia.");
            return;
        }
        for (Kelas kelas : daftarKelas) {
            kelas.displayInfo();
        }
    }
}
