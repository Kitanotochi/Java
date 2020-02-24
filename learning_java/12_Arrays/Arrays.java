public class Arrays {
//Одномерные массивы
    public static void main(String[] args) {
        int [] arr = new int[5]; //Создаем массив со значением "int"
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 12;
        System.out.println("Элемент с индексом 1 = " + arr[1]); //Вывод результата

        double [] d_arr = new double[20]; //Создали массив со значением типа "double"
        for (int i = 0; i < d_arr.length; i++)
            d_arr[i] = Math.random();
        for (int i = 0; i < d_arr.length; i++)
            System.out.println(d_arr[i]); //Вывод результата
        
        String[] s_arr = {"Игорь", "Олег", "Александр"}; //Создали массив со значением "string"
        for (int i = 0; i < s_arr.length; i++)
            System.out.println(s_arr[i]); //Вывод результата

        int max = arr[0]; //Узнаем максимальное значение массива "arr"
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
                System.out.println("Максимальное значение  массиве arr: " + max); //Вывод результата

                for (int a : arr) { //Создали переменную "а", в которую будем помещать элементы массива при каждой иттерации
                    System.out.println(a);
                }
            }


    }
}