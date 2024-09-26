public class Test {
    private static int idCounter = 1;

    public int id;
    public String name;

    public String nama;

    public Test(String name) {
        this.id = idCounter++;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
