package taskHome;

import java.util.Arrays;


public class Task {
    public static void main(String[] args) {


/*
//       // 16. Найти все пары элементов, сумма которых равна заданному числу.
        System.out.println("task16 : ");
        int[] array16 = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array16.length; i++) {
            for (int j = i + 1; j < array16.length; j++) {
                if (array16[i] + array16[j] == target) {
                    System.out.println(array16[i] + " + " + array16[j] + " = " + target);
                }
            }
        }
        System.out.println();


//        // 17. Проверить, есть ли в массиве дубликаты.
        int[] array17 = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        for (int i = 0; i < array17.length; i++) {
            for (int j = i+1; j <array17.length ; j++) {
                if (array17[i] == array17[j]){
                    hasDuplicates = true;
                }
        }
        }
        System.out.println("task17: ");
        System.out.println("hasDuplicates = " + hasDuplicates);
        System.out.println();

        System.out.println("task18 : ");
//        // 18. Удалить все нули из массива и сдвинуть элементы влево.
        int[] array18 = {0, 1, 0, 3, 0};
        int count = 0;

        for (int i = 0; i < array18.length; i++) {
            if (array18[i] != 0){
                count++;
            }
        }
        int[] newArr = {count};

        for (int i = 0; i < array18.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (array18[i] != 0){
                    newArr[j] = array18[i];
                    System.out.print(newArr[j]);
                }

            }
        }
        System.out.println();
        System.out.println();


//        // 20. Найти количество чисел, делящихся на заданное число без остатка.
        int[] array20 = {10, 15, 20, 24, 30};
        int divisor = 5;
        int countt= 0;

        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % divisor == 0){
                countt++;
            }
        }
        System.out.println("Количество чисел, делящихся на " + divisor + " без остатка равно: " + countt);



        System.out.println("task21: ");
//        // 21. Упорядочить массив по возрастанию.
        int[] array21 = {4, 2, -2, 7, 1, 3, -7};
        int min = 0;
        int temp;
        for (int i = 0; i < array21.length; i++) {
            for (int j = i + 1; j < array21.length; j++) {
                if (array21[i] > array21[j]) {
                    temp = array21[i];
                    array21[i] = array21[j];
                    array21[j] = temp;
                }
            }
            System.out.print(array21[i] + " ");
        }
        System.out.println();



        System.out.println();
        System.out.println("task22: ");
//        // 22. Найти индекс первого отрицательного элемента.
        int[] array22 = {1, 2, -3, 4, -5};
        int index = 0;
        for (int i = 0; i < array21.length; i++) {
            if (array21[i] < 0) {
                index = i;
            }
        }
        System.out.println("index = " + index);

        System.out.println("____________________________");
        System.out.println("task23: ");
//        // 23. Подсчитать сумму чисел на четных индексах.
        int[] array23 = {1, 2, 3, 4, 5};
int sum = 0;
        for (int i = 0; i < array23.length; i++) {
            if (i % 2 == 0){
                sum += array23[i];
            }
        }
        System.out.println("sum = " + sum);


        System.out.println("____________________________");
        System.out.println("task23: ");
//        // 24. Найти произведение всех элементов массива.
        int[] array24 = {2, 2, 3, 4};
        int mult = array24[0];
        for (int i = 1; i < array24.length; i++) {
            mult *= array24[i];
        }
        System.out.println("mult = " + mult);


        System.out.println("____________________________");
        System.out.println("task25: ");
//        // 25. Переместить все отрицательные числа в конец массива.
        int[] array25 = {1, -2, 3, -4, 5};
        int minim;
        for (int i = array25.length-1; i >=0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (array25[i] < 0){
                    minim = array25[i];
                    array25[i] = array25[j];
                    array25[j] = minim;
                }

            }
            System.out.print(array25[i] + " ");

        }
 */

        System.out.println("____________________________");
        System.out.println("task26: ");
//        // 26. Найти количество уникальных элементов в массиве.
        int[] array26 = {1, 2, 2, 3, 4, 4, 5};
        int unic = array26[0];
        int unicCount = 0;
        for (int i = 1; i < array26.length; i++) {

            if (unic != array26[i]) {
                unicCount++;

            } else {
                unic = array26[i];
            }

        }
        System.out.println("unicCount = " + unicCount);
        System.out.println("unic = " + unic);


        System.out.println();
        System.out.println("task27: ");
//        // 27. Переставить минимальный элемент массива в начало.
        int[] array27 = {4, 2, 1, 3, 5};
        int minElem = array27[0];
        int indexMin = 0;
        int tempor;
        for (int i = 1; i < array27.length; i++) {
            if (array27[i] < minElem) {
                minElem = array27[i];
                indexMin = i;
            }
        }
        System.out.println("minElem = " + minElem);
        System.out.println("indexMin = " + indexMin);

        tempor = array27[0];//4
        array27[0] = array27[indexMin];
        array27[indexMin] = tempor;
        for (int i = 0; i < array27.length; i++) {
            System.out.print(array27[i]);
        }





//        System.out.println(minElem);
//        System.out.println("indexMin = " + indexMin);


        // 28. Найти длину самой длинной последовательности одинаковых элементов.
//        int[] array28 = {1, 1, 2, 2, 2, 2, 3, 3};
//        int maxLength = 0;
//        int currentLength = 1;
//        int[] arrTemp = {array28.length};
//        int count = 0;
//        for (int i = 0; i < array28.length ; i++) {
//            for (int j = 0; j < array28.length; j++) {
//                if(array28[i] == array28[j]){
//                    currentLength++;
//                }
//                for (int k = 0; k < arrTemp.length;k++) {
//                    arrTemp[k] = currentLength;
//                    System.out.print(arrTemp[k]);
//                }
//            }
//
//        }


//        // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
//        int[] array = {1, -2, 3, 4, -5};


        // 30. Удалить все дубликаты из массива.
//        int[] array = {1, 2, 2, 3, 4, 4, 5};


    }
}

