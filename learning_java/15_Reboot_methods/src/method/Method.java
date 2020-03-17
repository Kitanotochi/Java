package method;

public class Method {
    public static void main(String[] args) {
        Person p = new Person("Igor", "Omsk", 20);
        System.out.println(p.getTextInfo());
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());
    }
}
