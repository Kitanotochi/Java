public class ComparisonOperations {
    //Операции сравнения
    public static void main(String[] args) {
        int a = 7; //Создали переменную "a"
        int b = 8; //Создали переменную "b"
        int c = 7; //Создали переменную "c"
        //Операция сравнения, выводит булевые значения. Либо "true" либо "false" 
        System.out.println(a + " < " + b + " = " + (a < b)); //Переменная "а" больше переменной "b"
        System.out.println(a + " > " + b + " = " + (a > b)); //Переменная "а" меньше переменной "b"
        System.out.println(a + " <= " + b + " = " + (a <= b)); //Переменная "а" меньше или равна переменной "b"
        System.out.println(a + " >= " + c + " = " + (a >= c)); //Переменная "а" больше либо равна переменной "с"
        System.out.println(a + " == " + c + " = " + (a == c)); //Переменная "а" равна переменной "с"
        System.out.println(a + " != " + c + " = " + (a != c)); //Проверка на неравенство
    }
}