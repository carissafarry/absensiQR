public class Siswa extends User {
    private long kelasId;
    private String nomorInduk;

    // Constructor
    public Siswa(String username, String password, String name, int profileId, String role, long kelasId, String nomorInduk) {
        super(username, password, name, profileId, role);
        this.kelasId = kelasId;
        this.nomorInduk = nomorInduk;
    }

    // Getter dan Setter
    public long getKelasId() {
        return kelasId;
    }

    public void setKelasId(long kelasId) {
        this.kelasId = kelasId;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    @Override
    public String toString() {
        return "Siswa {" +
                " username='" + getUsername() + '\'' +
                ", name='" + getName() + '\'' +
                ", profileId='" + getProfileId() + '\'' +
                ", role='" + getRole() + '\'' +
                ", kelasId='" + kelasId + '\'' +
                ", nomorInduk='" + nomorInduk + '\'' +
                '}' + '\n';
    }
}
