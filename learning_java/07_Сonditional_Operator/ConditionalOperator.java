public class ConditionalOperator {
    //Операторы сравнения
    public static void main(String[] args) {
        int a = 7; //Создание переменной
        int b = 9; //Создание переменной
        if (a < b) { //Если
            System.out.println("a < b"); //Вывод результата
        }
        else { //Иначе
            System.out.println("a >= b");//Вывод результат
        }
        String str = a < b ? "a < b" : "a >= b"; //Тернатный оператор
        System.out.println(str); //Вывод результата
    }
}