package exercise4;


import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter size: ");
        int size = input.nextInt();
        
        int[] numbers = new int [size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) {
            for (int space = 0; space < index; space++) {
             System.out.print(" ");
            } 
            
            System.out.println(numbers[index]);   
        }
    }

}