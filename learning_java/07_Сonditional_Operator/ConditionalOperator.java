public class ConditionalOperator {
    //Операторы сравнения
    public static void main(String[] args) {
        int a = 7; //Создание переменной
        int b = 9; //Создание переменной
        if (a < b) { //Если
            System.out.println("a < b"); //Вывод результата
        }
        else { //Иначе
            System.out.println("a >= b"); //Вывод результат
        }
        String str = a < b ? "a < b" : "a >= b"; //Тернатный оператор
        System.out.println(str); //Вывод результата
        System.out.println(a < b ? "a < b" : "a >= b"); //Полная анология кода с использованием "if" и "else"
        int age = 25; //Создали переменную
        if (age > 18) System.out.println("Совершеннолетний человек"); //Вывод результата
    }
}