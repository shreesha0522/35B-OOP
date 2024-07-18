package Week1;


// Question 1

// // // // // // // /*Create a student class to simulate a students profile.The class should have following attributes. student id, name and gpa. include methods to update gpa() and printprofile(). Implement functionality to create new student profiles, update gpas and print students profile



// public class Task{
//     public static void main(String[] args) {
//         Student s=new Student(101,"krish",4.0);
//         s.printProfiles();
//         s.setGpa(1.0);
//         System.out.println("");
//         s.printProfiles();
//     }
// }

// class Student{
//     /** This class includes the private attriutes student id, name and gpa
//      * it has a constructor to initialize the value of three attributes
//      * It also includes the method to update the gpa
//      * It has a print profile to print all the details of the student
//      */
//     private int studentId;
//     private String name;
//     private double gpa;

//     Student(int studentId,String name, double gpa){
//         this.studentId=studentId;
//         this.name=name;
//         this.gpa=gpa;
//     }

//     //for updation of gpa

//     void setGpa(double gpa){
//         this.gpa=gpa;
//     }

//     void printProfiles(){
//         System.out.println("The student id is "+ studentId);
//         System.out.println("The student name is "+ name);
//         System.out.println("The student gpa is "+ gpa);

//     }
// }


// Question 2

// // // // // // // // Create a bank account class to stimulate a bank account. the class should hava the following attributes. account number, account hollder and balance. include method to deposit(), withdraw() and check Balance().
// // // // // // // // implement functionality to
// // // // // // // // create new bank account, deposit, withdraw and check balance.

// public class Task{
//     public static void main(String[] args){
//         //Creating a new account
//         bankAccount ba=new bankAccount(151515,"krish", 45000);

//         //depositing a balance

//         ba.deposit(10000);

//         //withdrawing

//         ba.withdraw(40000);

//         //checkBalance

//         ba.checkBalance();

//     }
// }

// class bankAccount{
//     private int accountNumber;
//     private String accountHolder;
//     private double balance;

//     bankAccount(int accountNumber, String accountHolder, double balance){
//         this.accountHolder=accountHolder;
//         this.accountNumber=accountNumber;
//         this.balance=balance;
//     }

//     //deposit

//     void deposit(double balance){
//         if(balance>0){
//             this.balance+=balance;
//             System.out.println(balance+" is deposited sucessfully in your account.");
//         }else{
//             System.out.println("Amount should be in positive.");
//         }
//     }

//     // withdrae

//     void withdraw(double balance){
//         if(balance>0 && this.balance>=balance){
//             this.balance-=balance;
//             System.out.println(balance+" is withdrawn sucessfully from your account.");
//         }else{
//             System.out.println("Insufficient balance.");

//         }
//     }

//     //Check balance

//     void checkBalance(){
//         System.out.println("Account holder name is "+accountHolder);
//         System.out.println("Account number is"+ accountNumber);
//         System.out.println("You balance is"+ balance);
//     }
// }

// Question 3

// // // // // // // Create a shopping cart class to Stimulate an online shopping cart. The class should have the folllowing attributes. cart Id, customer name and items(a list of products). include nethods to additem() and calculate total. implement functionality to create new shopping carts, add/remove items and calculate the total cost of items in the cart.




// import java.util.ArrayList;

// public class Task{
//     public static void main(String[] args){
//         ShoppingCart sc=new ShoppingCart(450, "krish");
//         sc.addItem("orange");
//         sc.addItem("apple");
//         sc.addItem("Mango");
//         sc.removeItem("Mango");

//         sc.display();




//     }
// }

// class ShoppingCart{
//     private int cartId;
//     private String name;
//     private ArrayList<String> items;

//     ShoppingCart(int cartId, String name){
//         this.cartId=cartId;
//         this.name=name;
//         this.items=new ArrayList<>();
//     }

//     //method to add item


//     void addItem(String items){
//         this.items.add(items);
//         System.out.println(items+" is added successfully.");
//     }

//     //method to remove item

//     void removeItem(String items){
//         if(this.items.contains(items)){
//         this.items.remove(items);
//         System.out.println(items+" Removed Successfullly");


//         }else{
//             System.out.println("Item not found in a cart");
//         }

//     }

//     // calculate the total

//     double total(){
//         return items.size()*10;//Assuming that each item cost 10 rupees

//     }

//     //display

//     void display(){
//         System.out.println("The cart id is "+ cartId);
//         System.out.println("The name is "+ name);
//         System.out.println("Items in cart are as follow: ");

//         for(String item:items){
//             System.out.println(item);
//         }
//         System.out.println("The total cost is "+ total());
//     }
// }


// // // // // // Question 4

// // // // // //Design and implement a java prpogram that stimulates a financial transaction system. Your system should be capable of processing different types of transactions, such as deposits and withdrawals and aleting if any transactions exceed certail limits. Use interface to define common behaviours for transaction and implement these behaviours in different transaction classess

// // // // // // create an interface named Transaction with at least two methods

// // // // // // get Amount() which returns the amount of the transaction as double
// // // // // // isValid() which returns a boolean indication if the tranaction is valid based on the criteria

// // // // // //Implement the Transaction interface in at least three seperate classes, DepositTransaction and withdrawal Transaction and specific logic to determine if the transaction is valid.


// public class Task{
//     public static void main(String[] args){
//         //First object of first class
//         Transaction deposit = new DepositTransaction(10000);
//         System.out.println("The amount is "+ deposit.getAmount());
//         System.out.println("Is deposit valid "+ deposit.isValid());

//         Transaction withdrawal = new WithdrawalTranscation(7000, 10000);
//         System.out.println("Withdrawal Amount: " + withdrawal.getAmount());
//         System.out.println("Is Withdrawal Valid: " + withdrawal.isValid());

//         Transaction transfer = new TransferTransaction(8000, 10000);
//         System.out.println("Transfer Amount: " + transfer.getAmount());
//         System.out.println("Is Transfer Valid: " + transfer.isValid());
//     }
// }

// interface Transaction{
//     double  getAmount();
//     boolean isValid();
// }

// class DepositTransaction implements Transaction{

//     private double amount;
//     DepositTransaction(double amount){
//         this.amount=amount;
//     }

//     @Override
//     public double getAmount(){
//         return amount;
//     }

//     @Override
//     public boolean isValid(){
//         return amount<=10000;
//     }


// }

// class WithdrawalTranscation implements Transaction{
//     private int AcccountBalance;
//     private double amount;

//     WithdrawalTranscation(int AcccountBalance,double amount){
//         this.AcccountBalance=AcccountBalance;
//         this.amount=amount;
//     }

//     @Override
//     public double getAmount(){
//         return amount;
//     }

//     @Override

//     public boolean isValid(){
//         return amount<=AcccountBalance;
//     }

// }

// class TransferTransaction implements Transaction{
//     private double amount;
//     private int senderAcccountBalance;


//     TransferTransaction(double amount,int SenderAcccountBalance){
//         this.amount=amount;
//         this.senderAcccountBalance=SenderAcccountBalance;
//     }

//     @Override
//     public double getAmount(){
//         return amount;
//     }

//     @Override
//     public boolean isValid(){
//         return amount<=senderAcccountBalance;
//     }
// }

// Question 5

// // // // design and implement a java proogram that stimulates a network monitoring system. Your system should be capable of monitoring different types of network devices such as routers and switches, alert if any device are experiencing errors or downtown. Use interface to define common behaviours for network devices and implement these behaviours in different device classes

// // // // Create an interface named networkDecvice with at least two methods:

// // // // getStatus() hich returns the current status
// // // // isAvailable() which returns a boolen

// // // //Implement the Network Device interface in at least three seperate classes , Routers and switch. Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.


// public class Task{
//     public static void main(String[] args){
//         Router router = new Router("Running", true);
//         Switch networkSwitch = new Switch("Down", false);

//         // Check the status and availability of the router
//         System.out.println("Router Status: " + router.getStatus());
//         System.out.println("Router Available: " + router.isAvailable());

//         // Update the status of the router
//         router.setStatus("Down");
//         router.setAvailability(false);
//         System.out.println("Updated Router Status: " + router.getStatus());
//         System.out.println("Updated Router Available: " + router.isAvailable());

//         // Check the status and availability of the switch
//         System.out.println("Switch Status: " + networkSwitch.getStatus());
//         System.out.println("Switch Available: " + networkSwitch.isAvailable());

//         // Update the status of the switch
//         networkSwitch.setStatus("Running");
//         networkSwitch.setAvailability(true);
//         System.out.println("Updated Switch Status: " + networkSwitch.getStatus());
//         System.out.println("Updated Switch Available: " + networkSwitch.isAvailable());

//     }
// }

// interface networkDevice{
//     String getStatus();
//     boolean isAvailable();
//     void setStatus(String status);
//     void setAvailability(boolean isAvailable);
// }

// class Router implements networkDevice{
//     private String status;
//     private boolean isAvailable;
//     Router(String status, boolean isAvailable){
//         this.status=status;
//         this.isAvailable=isAvailable;
//     }
// @Override
//     public String getStatus(){
//         return status;
//     }
// @Override
//     public boolean isAvailable(){
//         return isAvailable;

//     }
// @Override
//     public void setStatus(String status){
//         this.status=status;
//     }

//     @Override
//     public void setAvailability(boolean isAvailable) {
//         this.isAvailable = isAvailable;
//     }
// }

// class Switch implements networkDevice {
//     private String status;
//     private boolean isAvailable;

//     Switch(String status, boolean isAvailable) {
//         this.status = status;
//         this.isAvailable = isAvailable;
//     }

//     @Override
//     public String getStatus() {
//         return status;
//     }

//     @Override
//     public boolean isAvailable() {
//         return isAvailable;
//     }

//     @Override
//     public void setStatus(String status) {
//         this.status = status;
//     }

//     @Override
//     public void setAvailability(boolean isAvailable) {
//         this.isAvailable = isAvailable;
//     }
// }




// // // // // //6 Design and imlement a java program that stimulate the undo feature of a text editor using a stack. The program should support adding text to the editor and undoing changes. The stack store strings, eaxb representing a version off the text.

// // // // // // adding tect to the editro. addText(String text)
// // // // // // undoing changes: undo()
// // // // // // getting the current text: getCurrentText()

// public class Task{
//     public static void main(String[] args){
//         TextEditor editor = new TextEditor(10);

//                 editor.addText("Hello, ");
//                 System.out.println(editor.getCurrentText()); 

//                 editor.addText("world!");
//                 System.out.println(editor.getCurrentText()); 

//                 editor.addText("suii");
//                 System.out.println(editor.getCurrentText());


//                 editor.undo();
//                 System.out.println(editor.getCurrentText());

//                 editor.undo();
//                 System.out.println(editor.getCurrentText()); 


//     }
// }

// class TextEditor{
//     private String currentText;
//     private int index;
//     private String[] history;

//     TextEditor(int size){
//         currentText="";
//         this.index=-1;
//         history=new String[size];
//     }

//     void addText(String text){
//         if(index<history.length-1){
//             history[++index]=text;
//             currentText+=text;
//         }
//     }

//     void undo(){
//         if(index>=0){
//             currentText=currentText.substring(0,currentText.length()-history[index].length());
//             index--;
//         }
//     }

//     String getCurrentText(){
//         return currentText;
//     }
// }

// Question 7
// 
// // // // // Design and implement a simple java application that prompts the user to enter a string within a specified length, for example 5 and 20 characters. Your application should throw and handle a custom exception if the user enters a string outside this length.
// // // // // InvalidStringLengthException
// // // // //A custom exception that is thrown when the user enters a string with a length outside the valid range(5 to 20 characters).

// // // // // InvalidStringLengthException.java

// import java.util.Scanner;

// public class Task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string (5 to 20 characters):");

//         String input = scanner.nextLine();

//         try {
//             if (input.length() < 5 || input.length() > 20) {
//                 throw new InvalidStringLengthException("String length must be between 5 and 20 characters.");
//             }
//             System.out.println("Valid string: " + input);
//         } catch (InvalidStringLengthException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// // InvalidStringLengthException.java
// class InvalidStringLengthException extends Exception {
//     InvalidStringLengthException(String message) {
//         super(message);
//     }
// }

// Question number 8
// // // // // Design and implement a simple java application that prompts the user to enter a valid emmail address. Your application should throw and handle a custome exceprtion if the user enter an invalid email address.

// // // // // InvalidEmailException
// // // // //A custome exception that is thrown when the user enters an email that does not match a vallid email pattern(eg: it should conain '@' and '.' characters/)
// import java.util.Scanner;
// public class Task{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter you email address");
//         String result=sc.nextLine();

//         try{
//             if(!(result.contains("@")&& result.contains(".")&& result.endsWith("@gmail.com"))){
//                 throw new InvalidEmailException("The email address is invalid");
//             }

//             System.out.println("Valid email address: "+result);
//         }catch(InvalidEmailException e1){
//             System.out.println("Error :"+e1.getMessage());
//         }

//     }
// }

// class InvalidEmailException extends Exception{
//     InvalidEmailException(String message){
//         super(message);
//     }
// }


// /Question 9

// // // // // Write a program that prompts the user to enter five integer values and reads them into an array. The program should consiste of the following methods:

// // // // //A method named "Max" that reads an array of integer values and returns the maxmimum value
// // // // //a method name "indexOfHighest" that returns the index of the highest element in an array of integers. If more than one suchh element exists, return the smallest index. invoke the above methods and demonstrates them in the program.
    // import java.util.Scanner;
    // public class Task{
    //     public static void main(String[] args){
    //         Scanner sc=new Scanner(System.in);
    //         int[] values=new int[5];

    //         for(int i=0;i<=4;i++){
    //             System.out.println("Enter a number: ");
    //             values[i]+=sc.nextInt();
    //         }


    //         System.out.println("The maximum values of the array is "+ max(values));
    //         System.out.println("The maximum values smallest index is "+ indexOfHighest(values));
    //     }



    //     static int max(int[] value){
    //         int max=value[0];
    //         for(int i=1;i<=value.length-1;i++){
    //             if(value[i]>max){
    //                 max=value[i];
    //             }
    //         }
    //         return max;
    //     }
    //     static int indexOfHighest(int[] value){
    //         int max_index=0;;
    //         for(int i=1;i<value.length;i++){
    //             if(value[i]>value[max_index]){
    //                 max_index=i;
    //             }
    //         }
    //         return max_index;
    //     }
    // }


//Question 10
// // // Write a program that the user to enter a sentence and reads into a String. The program should consist of the following methods;
// // //a method named "countVowels" that reads a string and returns the number of vowels in the string
// // // a method named "count Consonants" that reads a string and returns the number of consonant in the string.
// // //invoke the abover method and demonstrate them in the program.
// import java.util.Scanner;
// public class Task{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a sentence");
//         String sentence=sc.nextLine();

//         System.out.println("The number of vowel in the Sentence is "+ countVowels(sentence));
//         System.out.println("The number of consonant in the Sentence is "+ countConsonant(sentence));




//     }

//     static int countVowels(String sentence){
//         String lowerSentence=sentence.toLowerCase();
//         int count=0;

//         for(int i=0;i<lowerSentence.length();i++){
//             char ch=lowerSentence.charAt(i);

//             if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 count++;
//             }
//         }
//         return count;

//     }


//     static int countConsonant(String sentence){
//         String lowerSentence=sentence.toLowerCase();

//         int count=0;

//         for(int i=0;i<lowerSentence.length();i++){
//             char ch=lowerSentence.charAt(i);

//             if(Character.isLetter(ch) && !(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')){
//                 count++;
//             }
//         }
//         return count;

//     }
// }