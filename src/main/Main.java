public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the Main program...");
        
        // Directly call the initialize method from Api
        Api.initializeDatabaseConnection(
                "mysql-absensiqr-absensi-qr.g.aivencloud.com",
                "18865",
                "defaultdb",
                "avnadmin",
                "AVNS_A_P4HeqNqLccyRJYGDV"
        );
        
        System.out.println("Finished executing the Main program.");
    }
}