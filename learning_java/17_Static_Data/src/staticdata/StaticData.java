package staticdata;

public class StaticData {
    public static void main(String[] args) {
        new Person();
        System.out.println("Созданно объектов: " + Person.count);
    }
}
