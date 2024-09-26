public class Test {
    private static int idCounter = 1; //bila tidak menggunakan static bakal menggunakan value yang sudah di assign secara default

    public int id;
    public String name;


    public Test(String name) {
       
        this.id = idCounter;
        idCounter+=3;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
