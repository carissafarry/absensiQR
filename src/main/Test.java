public class Test {
    private static int idCounter = 1; //bila tidak menggunakan static bakal menggunakan value yang sudah di assign secara default

    public int id;
    public String name;


    public Test(String name) {
        this.id = idCounter++; // ini merupakan method konstruk yang akan dieksekusi ketika obj. test dibuatr++;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
