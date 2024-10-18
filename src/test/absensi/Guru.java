package absensi;

public class Guru extends User {
    private long mapelId;
    private String nip;

    // Constructor
    public Guru(String username, String password, String name, int profileId, String role, long mapelId, String nip) {
        super(username, password, name, profileId, role);
        this.mapelId = mapelId;
        this.nip = nip;
    }

    // Getter dan Setter
    public long getMapelId() {
        return mapelId;
    }

    public void setMapelId(long mapelId) {
        this.mapelId = mapelId;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Guru {" +
                " username='" + getUsername() + '\'' +
                ", name='" + getName() + '\'' +
                ", profileId='" + getProfileId() + '\'' +
                ", role='" + getRole() + '\'' +
                ", mapelId='" + mapelId + '\'' +
                ", nip='" + nip + '\'' +
                '}' + '\n';
    }
}
