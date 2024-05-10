package Week4;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//      1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        System.out.println("What is your name: ");
        String name=sc.nextLine();

        for(int i=0; i<5;i++){
            System.out.println("Hello "+name);
        }


// 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

// Miles    Kilometers

// 1    1.609

// 2    3.218

// …    ….

// 9    14.481

// 10    16.090

        System.out.println("Miles    Kilometers");
        for (int i = 1; i <= 10; i++) {
            double kilometers = i * 1.609;
            System.out.printf("%d    %.3f\n", i, kilometers);
        }


// 3. Write a program that generates the following table: 

// Number    Square

// 10    100

// 9    81

// ..    ….2    4

// 1    1

        System.out.println("Number    Square");
        for (int i = 10; i >= 1; i--) {
            int square = i * i;
            System.out.println(i + "    " + square);
        }

// 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

// *****

// *****

// *****

// *****

// *****

        System.out.print("Enter the width: ");
                int width = sc.nextInt();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

// 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:

// Sample Run:

// Enter a positive non-zero integer 4

// Sum of 1 to 4 is 10

// Do you want to continue? Enter ‘y’ for yes or any other character for no.

// y

// Enter a positive non-zero integer 3

// Sum of 1 to 3 is 6

// Do you want to continue? Enter ‘y’ for yes and any other character for no.

// n.

        char choice;
                
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int num = sc.nextInt();
            
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            
            System.out.println("Sum of 1 to " + num + " is " + sum);
            
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y');

// 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

// *

// **

// ***

// ****

// *****

// Use a nested for loop to generate the above pattern.

        System.out.print("Enter the width: ");
        int width2 = sc.nextInt();

        for (int i = 1; i <= width2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


// 7. Write a program to calculate the HCF of Two given numbers.

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int smaller = (num1 < num2) ? num1 : num2;
        int hcf = 1;
        
        for (int i = 1; i <= smaller; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);


// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);


// 9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.


        int greaterThan50 = 0;
        int lessThan50 = 0;
        int equalTo50 = 0;
        
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            
            if (num > 50) {
                greaterThan50++;
                sumGreaterThan50 += num;
            } else if (num < 50) {
                lessThan50++;
                sumLessThan50 += num;
            } else {
                equalTo50++;
            }
        }
        
        System.out.println("Numbers greater than 50: " + greaterThan50);
        System.out.println("Numbers less than 50: " + lessThan50);
        System.out.println("Numbers equal to 50: " + equalTo50);
        
        if (greaterThan50 != 0) {
            double avgGreaterThan50 = (double) sumGreaterThan50 / greaterThan50;
            System.out.println("Average of numbers greater than 50: " + avgGreaterThan50);
        } else {
            System.out.println("No numbers greater than 50");
        }
        
        if (lessThan50 != 0) {
            double avgLessThan50 = (double) sumLessThan50 / lessThan50;
            System.out.println("Average of numbers less than 50: " + avgLessThan50);
        } else {
            System.out.println("No numbers less than 50");
        }
        


// 10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.

        System.out.print("Enter a positive non-zero integer: ");
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("Sum of integers from 1 to " + num + " is: " + sum);
        
    }
}
