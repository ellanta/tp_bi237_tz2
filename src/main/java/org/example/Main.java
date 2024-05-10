package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static long _min(ArrayList<Long> numbers) {
        long min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static long _max(ArrayList<Long> numbers) {
        long max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static long _sum(ArrayList<Long> numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static long _mult(ArrayList<Long> numbers) {
        long mult = 1;
        for (int i = 0; i < numbers.size(); i++) {
            mult *= numbers.get(i);
        }
        return mult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла с расширением: ");
        String file_name = scanner.nextLine();
        scanner.close();
        try {
            ArrayList<Long> arr = new ArrayList<Long>();
            File file = new File(file_name);
            Scanner scanner2 = new Scanner(file);
            while (scanner2.hasNext()) {
                long number = scanner2.nextLong();
                arr.add(number);
            }
            System.out.println("Минимальное: " + _min(arr));
            System.out.println("Максимальное: " + _max(arr));
            System.out.println("Сумма: " + _sum(arr));
            System.out.println("Произведение: " + _mult(arr));
        } catch(Exception e) {
            System.out.println("File is not found");
        }
    }
}