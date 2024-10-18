public class User {
    private String username;
    private String password;
    private String name;
    private int profileId;
    private String role;

    // Constructor
    public User(String username, String password, String name, int profileId, String role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.profileId = profileId;
        this.role = role;
    }

    // Getter dan Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User {" +
                " username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", profileId=" + profileId + '\'' +
                ", role='" + role + '\'' +
                '}' + '\n';
    }
}
