package myclass;

public class MyClass {
    public static void main(String[] args) {
    Person p = new Person("Михаил", "Москва", 40);
    System.out.println(p.name);
    System.out.println(p.city);
    System.out.println(p.age);
    Person [] p_arr = new Person[3];
    p_arr[0] = new Person("Игорь", "Омск", 30);
    p_arr[1] = new Person("Олег", "Питер", 20);
    p_arr[2] = new Person("Андрей", "Москва", 18);
    for (int i = 0; i < p_arr.length; i++) {
        System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
    }
    }
}
