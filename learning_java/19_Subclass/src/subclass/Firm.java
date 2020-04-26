package subclass;

public class Firm {
    public String nameFirm;
    public Director director;

    public Firm(String nameFirm, String nameDirector, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector, age);
    }

    class Director {
        public String name;
        public int age;

        public Director(String name, int age) {
            
        }
    }
}
