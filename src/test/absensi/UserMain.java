import Absensi.User;
import java.util.Scanner;
import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        UserCRUD userCRUD = new UserCRUD(); // Membuat instance UserCRUD

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Add User");
            System.out.println("2. View User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Keluar");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Input username: ");
                    String username = scanner.nextLine();
                    System.out.print("Input password: ");
                    String password = scanner.nextLine();
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input profileId: ");
                    int profileId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input role: ");
                    String role = scanner.nextLine();

                    User user = new User(username, password, name, profileId, role);

                    userCRUD.addUser(user);
                    break;
                case 2:
                    userCRUD.viewUsers();
                    break;
                case 3:
                    System.out.print("Input username user yang ingin diupdate: ");
                    String updateUsername = scanner.nextLine();

                    // Mencari user berdasarkan username
                    User userToUpdate = userCRUD.readUser(updateUsername);

                    if (userToUpdate != null) {
                        // Update username jika ada input baru
                        System.out.print("Update username (biarkan kosong jika tidak ingin mengubah): ");
                        String newUsername = scanner.nextLine();
                        if (!newUsername.isEmpty()) {
                            userToUpdate.setUsername(newUsername);
                        }

                        // Update password jika ada input baru
                        System.out.print("Update password (biarkan kosong jika tidak ingin mengubah): ");
                        String newPassword = scanner.nextLine();
                        if (!newPassword.isEmpty()) {
                            userToUpdate.setPassword(newPassword);
                        }

                        // Update name jika ada input baru
                        System.out.print("Update name (biarkan kosong jika tidak ingin mengubah): ");
                        String newName = scanner.nextLine();
                        if (!newName.isEmpty()) {
                            userToUpdate.setName(newName);
                        }

                        // Update profileId jika ada input baru
                        System.out.print("Update profileId (biarkan kosong jika tidak ingin mengubah): ");
                        String newProfileId = scanner.nextLine();
                        if (!newProfileId.isEmpty()) {
                            userToUpdate.setProfileId(Integer.parseInt(newProfileId));
                        }

                        // Update role jika ada input baru
                        System.out.print("Update role (biarkan kosong jika tidak ingin mengubah): ");
                        String newRole = scanner.nextLine();
                        if (!newRole.isEmpty()) {
                            userToUpdate.setRole(newRole);
                        }

                        // Memanggil method updateUser
                        userCRUD.updateUser(updateUsername, userToUpdate);
                    } else {
                        System.out.println("User dengan username " + updateUsername + " tidak ditemukan.");
                    }
                    // System.out.print("Input username: ");
                    // String updatedUsername = scanner.nextLine();

                    // User readUser = userCRUD.readUser(updatedUsername);

                    // System.out.print("Input password: " + readUser.getPassword());
                    // String updatedPassword = scanner.nextLine();
                    // System.out.print("Input name: " + readUser.getName());
                    // String updatedName = scanner.nextLine();
                    // System.out.print("Input profileId: " + readUser.getProfileId());
                    // int updatedProfileId = scanner.nextInt();
                    // System.out.print("Input role: " + readUser.getRole());
                    // String updatedRole = scanner.nextLine();

                    // User updatedUser = new User(updatedUsername, updatedPassword, updatedName,
                    // updatedProfileId,updatedRole);

                    // userCRUD.addUser(updatedUser);
                    break;
                case 4:
                    System.out.print("Input username: ");
                    String deletedUsername = scanner.nextLine();
                    userCRUD.deleteUser(deletedUsername);
                    break;
                case 5:
                    scanner.close();
                    break;
                default:
                    System.out.println("Pilih yang bener");
                    break;
            }
        } while (option != 5);

    }
}
