public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10; // Обьявили переменную "a"
        int b = 20; // Обьявили переменную "b"
        int result = a + b; // Сложение переменных
        System.out.println("Сумма: " + result); //Вывод результата

        result = a - b; //Вычитание переменных
        System.out.println("Разность: " + result);//Вывод результата

        result = a * b; //Умножение переменных
        System.out.println("Произведение: " + result);//Вывод результата

        result = a / b; //Деление переменных
        System.out.println("Деление: " + result); //Вывод результата. "result" является целым типом данных
        double d = (double) a / b; //Создаем переменную типа "double", преобразуем в тип "double"
        System.out.println("Сумма: " + d);

        result = 7 % 3; //Создаем переменную
        System.out.println("Остаток от деления: " + result); //Вывод результата

        a++; //Инкремент - увеличивает переменную на еденицу. Эквивалент "a = a + 1", "a += 1"
        System.out.println("Инкремент: " + a); //Вывод результата
        b--; //Декремент - уменьшает переменную на еденицу
        System.out.println("Декремент: " + b); //Вывод результата
    }
}