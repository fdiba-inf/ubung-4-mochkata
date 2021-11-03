package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }

}
