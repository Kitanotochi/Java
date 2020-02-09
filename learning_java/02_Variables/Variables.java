public class Variables {
    //Переменные
    public static void main(String[] args) {
       byte b = 10;
       short s = 2000;
       int i = 29999999;
       long n = -939393939;
       float f = 5.7f;
       double d = 35.39;
       boolean bool = true;
       char c = 'D';
       String str = "My string";

       b = 20;
       String result = "";
       result += "Byte b = " + b + "\n";
       result += "Short s = " + s + "\n";
       result += "Int i = " + i + "\n";
       result += "Long n = " + n + "\n";
       result += "Float f = " + f + "\n";
       result += "Double d = " + d + "\n";
       result += "Boolean bool = " + bool + "\n";
       result += "Char c = " + c + "\n";
       result += "String str = " + str + "\n";
       System.out.println(result);

       String str_n = "53";
       int summa = Integer.parseInt(str_n) + 20;
       System.out.println(summa);       

    }
}