public class LoopOperatorDoWhile {
    //Оператор цикла do-while
    public static void main(String[] args) {
        int a = 5; //Создали переменную
        while (a > 10) { //Объявили цикл
            System.out.println("Мы в цикле while"); //Вывод результата
        }
        do {
            System.out.println("Мы в цикле do-while");
        } while (a > 10);
    }
}