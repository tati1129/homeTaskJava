package taskHome;

public class Task2 {
    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    int[] array16 = {1, 2, 3, 4, 5};
    int target = 6;

    // 17. Проверить, есть ли в массиве дубликаты.
    int[] array17 = {1, 2, 3, 4, 2};
    boolean hasDuplicates = false;

    // 18. Удалить все нули из массива и сдвинуть элементы влево.
       int[] array18 = {0, 1, 0, 3, 0};


    // 20. Найти количество чисел, делящихся на заданное число без остатка.
      int[] array20 = {10, 15, 20, 24, 30};
       int divisor = 5;

    // 21. Упорядочить массив по возрастанию.
       int[] array21 = {4, 2, -2, 7, 1, 3, -7};

    // 22. Найти индекс первого отрицательного элемента.
        int[] array22 = {1, 2, -3, 4, -5};

    // 23. Подсчитать сумму чисел на четных индексах.
        int[] array23 = {1, 2, 3, 4, 5};

    // 24. Найти произведение всех элементов массива.
      int[] array24 = {2, 2, 3, 4};

    // 25. Переместить все отрицательные числа в конец массива.
       int[] array25 = {1, -2, 3, -4, 5};
        int temp = 0;

    // 26. Найти количество уникальных элементов в массиве.
        int[] array26 = {1, 2, 2, 3, 4, 4, 5};

    // 27. Переставить минимальный элемент массива в начало.
        int[] array = {4, 2, 1, 3, 5};

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
       int[] array28 = {1, 1, 2, 2, 2, 2, 3, 3};
    int maxLength = 1;
      int currentLength = 1;

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
       int[] array29 = {1, -2, 3, 4, -5};

    // 30. Удалить все дубликаты из массива.
       int[] array30 = {1, 2, 2, 3, 4, 4, 5};




            // 1. Найти сумму элементов массива целых чисел.
//            int[] array = {1, 2, 3, 4};
//            int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);

//         2. Найти длину самой длинной строки в массиве строк.
//            String[] array = {"cat", "elephant", "dog"};
//            int maxLength = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() > maxLength) {
//                maxLength = array[i].length();
//            }
//        }
//        System.out.println(maxLength);


            // 3. Проверить, содержит ли массив строк заданное слово.
//        String[] array = {"apple", "banana", "cherry"};
//        String target = "banana";
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(target)) {
//                break;
//            }
//        }
//        System.out.println(target);


            // 4. Подсчитать количество строк, содержащих заданный символ.
//        String[] array = {"apple", "banana", "cherry"};
//        char target = 'a';
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].indexOf(target) != -1) {
//                count++;
//            }
//        }
//        System.out.println("символ " + target + ":" + count);

            // 5. Найти строку с максимальным количеством символов 'e'.
//        String[] array = {"elephant", "eagle", "dog"};
//        String maxString = " ";
//        int maxCount = 0;
//        int target = 'e';
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == target) {
//                    count++;
//                }
//            }
//            if (maxCount < count) {
//                maxCount = count;
//               maxString = array[i];
//            }
//        }System.out.println("max 'e' : " + maxString);

            // 6. Удалить из массива строк все строки, содержащие заданное слово.
//        String[] array = {"apple pie", "banana bread", "cherry tart"};
//        String target = "bread";
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains(target)) {
//                count++;
//            }
//        }
//        String[] newArray = new String[array.length - count];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].contains(target)) {
//                newArray[index] = array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newArray));


            // 7. Найти минимальный элемент массива целых чисел.
//        int[] array = {3, 1, 4, 1, 5};
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("min: " + min);


            // 8. Найти строку с минимальной длиной.
//        String[] array = {"cat", "elephant", "dog"};
//        String minString = array[0];
//        int minCount = minString.length();
//        for (int i = 1; i < array.length; i++) {
//            String currentString = array[i];
//            int currentLength = currentString.length();
//            if (currentLength < minCount || minCount == 0) {
//                minCount = currentLength;
//                minString = currentString;
//            }
//            if (currentLength == minCount && !currentString.equals(minString)) {
//                minString = currentString;
//            }
//            System.out.println("minString: " + minString);
//        }


            // 8. Найти строку с минимальной длиной.
//        String[] array = {"cat", "elephant", "dog"};
//        String minString = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i].length() < minString.length()) {
//                minString = array[i];
//            }
//        }
//        System.out.println("minString: " + minString);



            // 9. Подсчитать количество четных чисел в массиве.{
//        int[] array = {1, 2, 3, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("count: " + count);


            // 10. Найти строку, которая встречается чаще всего.
//        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
//        String mostFrequent = "";
//        int maxCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            int currentCount = 1;
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i].equals(array[j])) {
//                    currentCount++;
//                }
//            }
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                mostFrequent = array[i];
//            }
//        }
//        System.out.println("maxCount: " + maxCount + ", mostFrequent: " + mostFrequent);


        }



