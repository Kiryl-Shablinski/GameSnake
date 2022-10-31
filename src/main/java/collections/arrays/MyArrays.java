package collections.arrays;

//Создайте обычный числовой массив.
// Используя класс Arrays, проверьте в работе такие методы, как sort(), toString(), copyOfRange() и Equals().

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
        }

        System.out.println(Arrays.toString(numbers));
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copyNumbers));
        System.out.println(Arrays.equals(numbers, copyNumbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.equals(numbers, copyNumbers));
        int[] copy = Arrays.copyOfRange(numbers, 2, 7);
        System.out.println(Arrays.toString(copy));

    }
}
