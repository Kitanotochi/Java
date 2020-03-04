package myclass;

public class MyClass {
    public static void main(String[] args) {
    Person p = new Person("Михаил", "Москва", 40);
    System.out.println(p.name);
    System.out.println(p.city);
    System.out.println(p.age);
    Person [] p_arr = new Person[3];
    p_arr[0] = new Person("Игорь", "Омск", 30);
    p_arr[0] = new Person("Олег", "Питер", 20);
    p_arr[0] = new Person("Андрей", "Москва", 18);
    }
}
