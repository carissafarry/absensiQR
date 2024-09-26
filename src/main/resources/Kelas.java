import java.util.ArrayList;
import java.util.Scanner;

// Kelas untuk mendefinisikan atribut Kelas
class Kelas {
    private int idkelas;    // Atribut ID Kelas
    private String nama;    // Atribut Nama Kelas
    private String angkatan; // Atribut Angkatan

    public Kelas(int idkelas, String nama, String angkatan) {
        this.idkelas = idkelas;
        this.nama = nama;
        this.angkatan = angkatan;
    }

    public int getIdKelas() {
        return idkelas;
    }

    public String getNama() {
        return nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void displayInfo() {
        System.out.println("ID Kelas: " + idkelas + ", Nama Kelas: " + nama + ", Angkatan: " + angkatan);
    }
}
