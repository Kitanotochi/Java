public class BitOperations {
    //Битовые операции
    public static void main(String[] args) {
        int a = 4; //Создали переменную "a"
        int b = 7; //Создали перемунную "b"
        String s_a = Integer.toBinaryString(a); //Преобразуем переменную "a" в двоичную
        String s_b = Integer.toBinaryString(b); //Преобразуем переменную "b" в двоичную
        System.out.println("s_a = " + s_a); //Вывод результата
        System.out.println("s_a = " + s_b); //Вывод результата
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b)); //Выводим результат с операцией "&"
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b)); //Выводим результат с операцией "|"
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b)); //Выводим резултат с операцией "^"
        System.out.println("~" + s_a + " = " + Integer.toBinaryString(~a)); //Выводим резульат с операцией "~"
        System.out.println("~" + a + " = " + ~a); //Вывод результата. Инвертация
        System.out.println(s_a + " >>1 = " + Integer.toBinaryString(a>>1)); //Вывод результата операцией побитовый сдвиг"

    }
}
