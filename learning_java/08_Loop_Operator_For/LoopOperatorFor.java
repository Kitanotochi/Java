public class LoopOperatorFor {
    //Оператор цикла
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) { //Объявляем переменную целого типа и присваиваем значение ноль. Переменная увеличивается на еденицу
            System.out.println(i + " "); //Вывод результата
        }
        System.out.println();
        for (int i = 0; i < 100; i++)
            if (i % 2 == 0) System.out.print(i + " ");
        int summa = 0;
        int n = 10;
        for (int i = 0; i <= n; i += 2) {
            summa += i;
        }
        System.out.println();
        System.out.println("Сумма четных чисел от 0 до " + n + " = " + summa);
    }
}