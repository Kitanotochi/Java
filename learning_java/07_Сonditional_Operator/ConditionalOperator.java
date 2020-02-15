import javax.swing.JOptionPane;

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
        if (age > 18) System.out.println("Совершеннолетний человек"); //Вывод результата. Условие истино. При ложном условии, результат не будет выведен
        
        String in; //Создали строковую переменную
        in = JOptionPane.showInputDialog(null, "Введите число:", JOptionPane.QUESTION_MESSAGE);
        double n = Double.parseDouble(in);
        if (n > 0) System.out.println("Вы ввели положительное число"); //Если, условие больше нуля, вывести положительное число
        else if (n == 0) System.out.println("Вы ввели ноль"); //Если, условие равно нулю, вывести ноль
        else System.out.println("Вы ввели отрицательное число"); //Иначе, выводит отрицательное значение
    }
}