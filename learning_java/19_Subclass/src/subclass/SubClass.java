package subclass;

public class SubClass {
    public static void main(String[] args) {
        Firm f = new Firm("My Firm", "Igor", 30);
        System.out.println(f.director.name);
        System.out.println("Директор является пенсионером " + f.director.isPensioner());


    }
}
