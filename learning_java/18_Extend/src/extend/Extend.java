package extend;

public class Extend {
    public static void main(String[] args) {
        Programmer p = new Programmer("Michael", "Omsk", 45, 20);
        System.out.println(p.getTextInfo());

        Worker w = new Worker();
        w.setSallary(20000);
        System.out.println(w.getTextInfo());
        System.out.println((new Worker()).getTextInfo());

        Person prog = new Programmer("Igor", "Novgorod", 30, 15);
        System.out.println(prog.getTextInfo());
    }
}
