import javax.swing.JOptionPane;

public class LoopOperatorWhile {
//Оператор цикла while
    public static void main(String[] args){
        int i = 0; //Создали переменную
        while (i < 100) { //Условие 
            System.out.print(i + " "); //Вывод результата
            i++; // Инкремент
        }
        System.out.println();
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            }
            else {
                int summa = 0;
                i = 1;
                while (i <= n) {
                    summa += i;
                    i++;
                }
                System.out.println("Сумма чисел от 0 до " + n + " = " + summa);
            }
        }
        else {
            System.out.println("Вы не ввели число");
        }
    }
}