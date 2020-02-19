public class OperatorSwitchCase{
    //Оператор Switch-case
    public static void main(String[] args) {
        int a = 1;
        String s;
        switch (a) {
            case 1:
                s = "Один";
                break;
            case 2:
                s = "Два";
                break;
            case 3:
                s = "Три";
                break;
            default:
                s = "Другое число";
        }
        System.out.println(s);
    }
}


