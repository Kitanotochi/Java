public class LogicalOperations {
    public static void main(String[] args) {
       boolean b_1 = true; //Создали переменную "b_1"
       boolean b_2 = false; //Создали переменную "b_2"
       System.out.println(b_1 + " && " + b_2  + " = " + (b_1 && b_2)); //Вывод результата сравнения "логическо И"
       System.out.println(b_1 + " || " + b_2  + " = " + (b_1 || b_2)); //Вывод результата сравнения "логическое ИЛИ"
       System.out.println(b_1 + " ^ " + b_2  + " = " + (b_1 ^ b_2)); //Вывод результата сравнения "исключающее ИЛИ"
       System.out.println("!" + b_1  + " = " + !b_1); //Вывод результата оператора "отрицания". Он инвертирует значение
    }
}
