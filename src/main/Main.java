import org.springframework.beans.factory.annotation.Value;

public class Main {
    // private static Environment env;

    @Value("${DB_HOSTNAME}")
    final static String db_hostname = "mysql-absensiqr-absensi-qr.g.aivencloud.com";

    @Value("${DB_PORT}")
    final static String db_port = "18865";

    @Value("${DB_NAME}")
    final static String db_name = "absensiQR";

    @Value("${DB_USERNAME}")
    final static String db_username = "avnadmin";

    @Value("${DB_PASSWORD}")
    final static String db_password = "AVNS_A_P4HeqNqLccyRJYGDV";

    public static void main(String[] args) {
        System.out.println("Starting the Main program...");
        
        // Directly call the initialize method from Api
        Api.initializeDatabaseConnection(
            db_hostname,
            db_port,
            db_name,
            db_username,
            db_password
        );
        
        System.out.println("Finished executing the Main program.");
    }
}