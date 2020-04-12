package extend;

public class Person {
    public String name; //Полный доступ к этому свойству
    protected String city; //Данное свойство будет доступно внутри пакета, а так-же во всех классах наследника
    private int age; //Данное свойство доступно внутри этого класса

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public Person() { //Перегрузка конструкторов
        this("Default name", "Default city", 18);
    }
    public String getTextInfo() { //Метод GET

        return "Имя " + this.name + "; Город " + this.city + "; Возраст " + this.age;
    }
    public String getName() {

        return this.name;
    }
    public String getCity() {

        return this.city;
    }
    public int getAge() {

        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {

        this.city = city;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public void whoIsOlder(Person p) {
        if (this.age > p.age) System.out.println(this.name + " старше чем, " + p.name);
        else if (this.age == p.age) System.out.println(this.name + " и " + p.name + " росвесники!");
        else System.out.println(this.name + " младше чем, " + p.name);
    }
}
