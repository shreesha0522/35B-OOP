package Week3;

import java.util.Scanner;

public class Task3 {
    // Task To Do

    // 1. Write a JAVA program to find the maximum between three numbers.

    public static void main(String[] args){

    int num1 = 10;
    int num2 = 20;
    int num3 = 15;

    int max = num1; 

    if (num2 > max) {
        max = num2;
    }

    if (num3 > max) {
        max = num3;
    }

    System.out.println("Maximum number is: " + max);
    
    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    int number=10;
    if (number > 0) {
        System.out.println(number + " is positive.");
    } else if (number < 0) {
        System.out.println(number + " is negative.");
    } else {
        System.out.println("The number is zero.");
    }
    // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numb = scanner.nextInt();

        if (numb % 5 == 0 && numb % 11 == 0) {
            System.out.println(numb + " is divisible by both 5 and 11.");
        } else {
            System.out.println(numb + " is not divisible by both 5 and 11.");
        }
    
    // 4. Write a JAVA program to check whether a number is even or odd.

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println(num + " is even.");
    } else {
        System.out.println(num + " is odd.");
    }

    
    
    // 5. Write a JAVA program to check whether a year is a leap year or not. 

    
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    boolean isLeapYear = false;

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        isLeapYear = true;
    }

    if (isLeapYear) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
    
    // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
    
    // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

    
    System.out.print("Enter an alphabet: ");
    char alphabet = scanner.next().charAt(0);

    alphabet = Character.toLowerCase(alphabet);

    if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
        System.out.println("The entered alphabet '" + alphabet + "' is a vowel.");
    } else {
        System.out.println("The entered alphabet '" + alphabet + "' is a consonant.");
    }

    
    
    
    // Some Switch case Statements Questions:
    
    // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

   
        System.out.print("Enter the student's grade (A, B, C, D, or F): ");
        String grade = scanner.nextLine();
        
        
        double gpa;
        switch (grade.toUpperCase()) {
            case "A":
                gpa = 4.0;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "F":
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return; 
        }
        
        System.out.println("The GPA value for grade " + grade + " is: " + gpa);
    


    
    // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.

    System.out.print("Enter the first number: ");
    double numbe = scanner.nextDouble();
    
    // Prompt the user to enter the operator
    System.out.print("Enter the operator (+, -, *, /): ");
    String operator = scanner.next();
    
    System.out.print("Enter the second number: ");
    double numbe2 = scanner.nextDouble();

    
    double result;
    switch (operator) {
        case "+":
            result = numbe + numbe2;
            break;
        case "-":
            result = numbe - numbe2;
            break;
        case "*":
            result = numbe * numbe2;
            break;
        case "/":
            result = numbe / numbe2;
            break;
        default:
            System.out.println("Error: Invalid operator entered.");
            return;
    }
    
    System.out.println("Result: " + numbe + " " + operator + " " + num + " = " + result);
    
    // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.

    System.out.print("Enter the month (1 to 12): ");
    int month = scanner.nextInt();
    
    
    String season;
    switch (month) {
        case 1:
        case 2:
        case 3:
            season = "Winter";
            break;
        case 4:
        case 5:
        case 6:
            season = "Spring";
            break;
        case 7:
        case 8:
        case 9:
            season = "Summer";
            break;
        case 10:
        case 11:
        case 12:
            season = "Fall";
            break;
        default:
            season = "Invalid month entered.";
            break;
    }
    
    System.out.println("The season for month " + month + " is: " + season);


    
    // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.

    System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + circleArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;
            case 4:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice! Please choose a number between 1 and 4.");
        }
    
    }

    
}