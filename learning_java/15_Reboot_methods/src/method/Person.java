package method;

public class Person {
    String name;
    String city;
    int age;

    public Person(String name, String city, int age) {
        this.name =name;
        this.city = city;
        this.age = age;
    }
    public String getTextInfo() {
        return "Имя " + this.name + "; Город" + this.city + "; Возраст " + this.age;
    }
}
