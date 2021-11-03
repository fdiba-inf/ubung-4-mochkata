package exercise4;


import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        double[] numbers = new double[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
          
          double maxNumber = numbers[0];
          for (int index = 1; index < numbers.length; index++) {
             if (numbers[index] > maxNumber) {
               maxNumber = numbers[index];
             }
          }
          System.out.println("Max number: " + maxNumber);

            
          }

        
    }

