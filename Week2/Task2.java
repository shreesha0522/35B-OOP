package Week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
// //         1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        System.out.println("THIS IS TO CHECK WHETHER INE IS ELIGIBLE TO VOTE OR NOT.");
        Scanner sc=new Scanner(System.in);

//         System.out.println("Enter your age; ");

//         int age=sc.nextInt();

//         if(age>18){
//             System.out.println("You can vote");

//         }

//         else{

//             System.out.println("You cannot vote");
//         }
// // 2. Write a program to calculate SI. 

// // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

//         System.out.println("THIS IS THE SYSTEM TO CALCULATE SIMPLE INTEREST.");

//         System.out.println("Enter Principle Amount: " );
//         double principle=sc.nextDouble();

//         System.out.println("Enter Time limit");
//         double time=sc.nextDouble();

//         System.out.println("Enter Rate of Interest");
//         double rate=sc.nextDouble();

//         double simpleInterest=(principle*time*rate)/100;
//         System.out.println("The Simple Interest is: "+simpleInterest);

// // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

// // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

//         System.out.println("\nCALCULATE AREA OF TRIANGLE:");

//         System.out.println("Enter the base of the triangle:");
//         double base = sc.nextDouble();

//         System.out.println("Enter the height of the triangle:");
//         double height = sc.nextDouble();

//         double areaOfTriangle = 0.5 * base * height;
//         System.out.println("The Area of the Triangle is: " + areaOfTriangle);

//         // Program to calculate Volume of Cube and Cuboid
//         System.out.println("\nCALCULATE VOLUME OF CUBE AND CUBOID:");

//         System.out.println("Enter the length of the cuboid:");
//         double length = sc.nextDouble();

//         System.out.println("Enter the width of the cuboid:");
//         double width = sc.nextDouble();

//         System.out.println("Enter the height of the cuboid:");
//         double heightCuboid = sc.nextDouble();

//         double volumeOfCuboid = length * width * heightCuboid;
//         System.out.println("The Volume of the Cuboid is: " + volumeOfCuboid);

//         System.out.println("Enter the side of the cube:");
//         double side = sc.nextDouble();

//         double volumeOfCube = Math.pow(side, 3);
//         System.out.println("The Volume of the Cube is: " + volumeOfCube);

// // 4. Write the ternary operator for question no. 1

//         System.out.println("to check the eligibility for voting using ternary operator ");

        

//         System.out.println("Enter your age:");
//         int age1 = sc.nextInt();

//         String message = (age1 > 18) ? "You can vote" : "You cannot vote";
//         System.out.println(message);


// // 5. Write a program to take two integer inputs from the user and print the sum and product of them.

//         System.out.println("Calculate the sum and product of the two integer.");

//         System.out.println("Enter the first integer:");
//         int num1 = sc.nextInt();

//         System.out.println("Enter the second integer:");
//         int num2 = sc.nextInt();

//         int sum = num1 + num2;
//         int product = num1 * num2;

//         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//         System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);


// // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.

//         //It is link with question number 5.

//         System.out.println("The division of sum and product which was obtained from question number 5.");

//         double division = (double) sum / product;

//         System.out.println("The division of the sum and product is: " + division);


// // 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

//         System.out.println("This system communicate with the user as per their name, roll number and field of interest");
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();

//         System.out.println("Enter your roll number:");
//         String rollNumber = sc.nextLine();

//         System.out.println("Enter your field of interest:");
//         String fieldOfInterest = sc.nextLine();

//         System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest + ".");
                
// // 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

//         // area of traingle , simple interest and volume of cube and cuboid is done already in above questions.

//         System.out.println("It calculates the are and perimeter of square.");
        
//         System.out.println("Enter the side of the square:");
//         double side1 = sc.nextDouble();

//         double areaOfSquare = side1 * side1;
//         double perimeterOfSquare = 4 * side;

//         System.out.println("Area of the square is: " + areaOfSquare);
//         System.out.println("Perimeter of the square is: " + perimeterOfSquare);
// // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

//         System.out.println("Enter the length of the rectangle:");
//         double length1 = sc.nextDouble();

//         System.out.println("Enter the breadth of the rectangle:");
//         double breadth = sc.nextDouble();

//         double area = length1 * breadth;

//         int areaInt = (int) area;
//         System.out.println("The area of the rectangle (type casted to int) is: " + areaInt);


// // 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

// // a. If equal to or more than 70 -> First Class

// // b. If more than 59 -> Upper Second Class

// // c. If more than 49 -> Second class

// // d. If more than 39 -> Third class and if below than 40 the result is fail. 

// // Hint: Use ternary operator

        System.out.println("It calculates the  final result by following the given criteria.");

        System.out.println("Enter marks of Subject 1:");
        int subject1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2:");
        int subject2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3:");
        int subject3 = sc.nextInt();

        System.out.println("Enter marks of Subject 4:");
        int subject4 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4;

        double percentage = (totalMarks / 4) * 100;

        String result = (percentage >= 70) ? "First Class" :
                       (percentage > 59) ? "Upper Second Class" :
                       (percentage > 49) ? "Second Class" :
                       (percentage > 39) ? "Third Class" : "Fail";

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        sc.close();



    }
}