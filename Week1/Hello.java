
package Week1;

public class Hello{
    public static void main(String[] args){
        /*1. Write a program that prints Hello World! to the console. Save the program as Hello.java. */
        System.out.println("Hello WOrld");

        /*2. Extend/Modify the above program to print two additional lines:

        This is my first program

        I am on module ST4003CEM

        System.out.print (not println) and produces the same output. */

        System.out.print("This is my first program\n");
        System.out.print("I am on module ST4003CEM\n");

        /*3. Write a program that prints the following output:

            A "quoted" String is

            'much' better if you learn

            the rules of "escape sequences."

            Also, "" represents an empty

            String. Don't forget: use \"

            instead of " !

            '' is not the same as " */

            System.out.print("A \"quoted\" String is\n");
            System.out.print("'much' better if you learn\n");
            System.out.print("the rules of \"escape sequences.\"\n");
            System.out.print("Also, \"\" represents an empty\n");
            System.out.print("String. Don't forget: use \\\"\n");
            System.out.print("\"instead of \" !\n");


            /*
             * 4. WAP that prints the following pattern:

                *

                **

                ***

                ****
             */

             System.out.println("*");
             System.out.println("**");

             System.out.println("***");
             System.out.println("****");

             /*5. WAP prints the following pattern:

                *********

                *********

                *********

                ********* */

                System.out.println("*********\n*********\n*********\n*********\n" );


                /*6. WAP that prints the following output:

                A well-formed Java program has a main method with { and } braces.



                A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

                (But we type \" instead!)

                What is the difference between

                a ' and a "?  Or between a " and a \"?



                One is what we see when we're typing our program. The other is what appears on the "console."
                        

*/

        System.out.println("A well-formed Java program has a main method with { and } braces.");
        System.out.println("\nA System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println("\n(But we type \\\" instead!)\n");
        System.out.println("What is the difference between\na ' and a \"?  Or between a \" and a \\\"?\n");
        System.out.println("One is what we see when we're typing our program. The other is what appears on the \"console.\"");
  

    }
}