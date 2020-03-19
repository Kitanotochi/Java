package method;

public class Method {
    public static void main(String[] args) {
        Person p = new Person("Igor", "Omsk", 20);
        System.out.println(p.getTextInfo());
        p.setName("German");
        p.setCity("London");
        p.setAge(20);
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());

        Person pNew = new Person("Alex", "Moscow", 20);
        p.whoIsOlder(pNew);
        pNew.setAge(30);
        p.whoIsOlder(pNew);
        pNew.setAge(10);
        p.whoIsOlder(pNew);
    }
}
