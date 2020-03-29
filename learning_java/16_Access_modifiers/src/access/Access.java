package access;

public class Access {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.city); // Работает, поскольку один пакет
        // System.out.println(p.age); - Ошибка
    }
}
