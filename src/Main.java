import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);

        task2(scanner);

        task3();

        task4(scanner);

        task5(scanner);

        task6(scanner);

        task7(scanner);

        task8(scanner);

        task9(scanner);

        task10(scanner);

        task11(scanner);

        task12(scanner);

        task13(scanner);

        task14(scanner);

        task15(scanner);

        task16(scanner);

        task17(scanner);

        task18(scanner);

        task19(scanner);

        task20(scanner);

        scanner.close();
    }

    // Задача 1: Четное или нечетное число
    public static void task1(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number + (number % 2 == 0 ? " является четным числом." : " является нечетным числом."));
    }

    // Задача 2: Минимальное из трех чисел
    public static void task2(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Минимальное число: " + min);
    }

    // Задача 3: Таблица умножения
    public static void task3() {
        System.out.println("Таблица умножения на 8:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 * " + i + " = " + (8 * i));
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    public static void task4(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
    }

    // Задача 5: Число Фибоначчи
    public static void task5(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int[] fib = new int[N];
        fib[0] = 0;
        if (N > 1) fib[1] = 1;

        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib[i] + (i < N - 1 ? ", " : "\n"));
        }
    }

    // Задача 6: Проверка простого числа
    public static void task6(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " является простым числом." : " не является простым числом."));
    }
    // Задача 7: Обратный порядок чисел
    public static void task7(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        System.out.println("Числа от " + N + " до 1 в обратном порядке:");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Задача 8: Сумма четных чисел
    public static void task8(Scanner scanner) {
        System.out.print("Введите первое число (A): ");
        int A = scanner.nextInt();

        System.out.print("Введите второе число (B): ");
        int B = scanner.nextInt();

        int sumEven = 0;
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + A + " до " + B + ": " + sumEven);
    }

    // Задача 9: обратная строка
    public static void task9(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Обратный порядок строки: " + reversedStr);
    }

    // Задача 10: Сумма четных чисел
    public static void task10(Scanner scanner) {
        System.out.print("Введите целое число: ");
        String number = scanner.next();
        int digitCount = number.replaceAll("[^\\d]", "").length(); 
        System.out.println("Количество цифр в числе: " + digitCount);
    }
    // Задача 11: Факториал числа
    public static void task11(Scanner scanner) {
        System.out.print("Введите целое число для вычисления факториала: ");
        int N = scanner.nextInt();
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        System.out.println("Факториал числа " + N + " равен: " + fact);
    }

    // Задача 12: Сумма цифр числа
    public static void task12(Scanner scanner) {
        System.out.print("Введите целое число: ");
        String number = scanner.next();
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    // Задача 13: Палиндром
    public static void task13(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(str + (str.equals(reversedStr) ? " является палиндромом." : " не является палиндромом."));
    }

    // Задача 14: Найти максимальное число в массиве
    public static void task14(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    // Задача 15: Сумма всех элементов массива
    public static void task15(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
    // Задача 16: Количество положительных и отрицательных чисел
    public static void task16(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int positiveCount = 0, negativeCount = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }


    // Задача 17: Простые числа в диапазоне
    public static void task17(Scanner scanner) {
        System.out.print("Введите два целых числа A и B (A < B): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print("Простые числа в диапазоне от " + A + " до " + B + ": ");
        for (int num = A; num <= B; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void task18(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelsCount);
        System.out.println("Количество согласных: " + consonantsCount);
    }

    // Задача 19: Перестановка слов в строке
    public static void task19(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Перестановка слов в строке: " + reversed.toString().trim());
    }

    // Задача 20: Число Армстронга
    public static void task20(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        System.out.println(originalNum + (sum == originalNum ? " является числом Армстронга." : " не является числом Армстронга."));
    }
}