
/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

Define a program to find out whether a given number is even or odd.

A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

Write a program to print the sum of two numbers entered by user by defining your own method.

Define a method that returns the product of two numbers entered by user.

Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

Define a method to find out if a number is prime or not.

Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
Write a function to find if a number is a palindrome or not. Take number as parameter.

Convert the programs in flow of program, first java, conditionals & loops assignments into functions.

Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

Write a function that returns all prime numbers between two given numbers.

Write a function that returns the sum of first n natural numbers. */




import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class video11questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
//        System.out.println(sumnaturalnumbers1(number));
        System.out.println(sumnaturalnumbers2(number));


    }

    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    static int sumnaturalnumbers1(int number) {
        int sum = 0;
        for(int i = 1; i<=number; i++ ){
            sum+= i;
        }
        return sum;
    }
    static int sumnaturalnumbers2(int number){
        int sum = number * (number +1)/2;
        return sum;
    }
}




/*-----------------------------------------------------------------------------------------------------
                   DAY - 01; FUNCTION QUESTIONS;
------------------------------------------------------------------------------------------------------
* QUESTION-1 Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
*    Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("ENTER 3 NUMBERS");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        //displaying elements

        //   System.out.print(Arrays.toString(nums));
        System.out.println("MAX ELEMENT IS " + maxNo(nums));
        System.out.println("MIN ELEMENT IS " + minNo(nums));


    }
    static int maxNo(int[]nums){
        int  max = 0;
       for(int i = 0; i< nums.length; i++){
           if(nums[i] > max){
               max = nums[i];
           }
       }
       return max;
    }

    static int minNo(int[]nums){
        int  min = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
        *
 ----------------------------------------------------------------------------------------------------------------     *
        *QUESTION 2 -Define a program to find out whether a given number is even or odd.
        *  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = sc.nextInt();
        oddeven(num);


    }
    static void oddeven(int num){
        if(num % 2 ==0){
            System.out.println("this is an even number");
        }
        else{
            System.out.println("this is an odd number");
        }
    }
    *
  ------------------------------------------------------------------------------------------------------
    * QUESTION 3 - A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        *
        *  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE");
        int num = sc.nextInt();
        voting_age(num);


    }
    static void voting_age(int num){
        if(num >= 18){
            System.out.println("ELIGIBLE");
        }
        else{
            System.out.println("NOT ELIGIBLE");
        }
    }
    *
    *
    ------------------------------------------------------------------------------------------------------
    * QUESTION 4 - Write a program to print the sum of two numbers entered by user by defining your own method.

    *  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SUM OF THE NUMBERS IS " + add(a,b));


    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
------------------------------------------------------------------------------------------------------
*
* QUESTION 5) Define a method that returns the product of two numbers entered by user.
*     import java.util.Scanner;
public class video11questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SUM OF THE NUMBERS IS " + product(a,b));

    }
    static int product(int a, int b) {
        int product = a * b;
        return product;
    }
  ----------------------------------------------------------------------------------------------------
  QUESTION 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        float radius = sc.nextInt();
        area_and_circumference(radius);


    }

    static void area_and_circumference(double radius) {
        double circumference= 2*Math.PI*radius;
        System.out.println("CIRCUMFERENCE IS "+ circumference);
        double area = Math.PI*radius*radius;
        System.out.println("AREA OF CIRCLE IS "+ area);
    }

    ----------------------------------------------------------------------------------------------------
    QUES 7-
    Define a method to find out if a number is prime or not.

      Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int a = sc.nextInt();
        System.out.println(isprime(a));



    }
    //for a number to be prime it should only be divisible by itself and the number;

    static boolean isprime(int a){
        if(a <= 1){
            return false; //because negative numbers and number till 1 are not prime
        }
        for(int i = 2; i*i <=a; i++){
            if(a%i==0){
                //check if there is any other divisor of the number from 2 till "a"; and if it does have it is not a prime number;
                return false;
            }
        }
        return true;
    }
    -----------------------------------------------------------------------------------------------
        -----------------------------------------------------------------------------------------------

      -----------------------------------------------------------------------------------------------
           DAY 2 QUESTIONS ON FUNCTIONS;

           Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display
            grades according to the marks entered as below:

 Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
    *
     public class video11questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MARKS");
        int marks= sc.nextInt();

       grades(marks);


    }
    static void grades(int marks){

        if(marks <=100 && marks >90){
            System.out.println("AA");
        }

        if(marks <=90 && marks >80){
            System.out.println("AB");
        }

        if(marks <=80 && marks >70){
            System.out.println("BB");
        }

        if(marks <=70 && marks >60){
            System.out.println("BC");
        }

        if(marks <=60 && marks >50){
            System.out.println("CD");
        }

        if(marks <=50 && marks >40){
            System.out.println("DD");
        }

        if(marks<= 40){
            System.out.println("FAIL");
        }
    }
}
    -----------------------------------------------------------------------------------------------

    QUESTION 8-
    Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1


 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int number= sc.nextInt();
        System.out.println("factorial is ");
        factorial(number);

    }
    static void  factorial(int number){
        int factorial = 1;
     for(int i =1; i <= number; i++){
         factorial*= i;
     }
        System.out.println(factorial);
    }

}

 -----------------------------------------------------------------------------------------------
QUESTION 9 - Write a function to find if a number is a palindrome or not. Take number as parameter.

 int number = sc.nextInt();
        System.out.println("result is" + palindrome(number));


    }
    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    static boolean palindrome(int number) {
        int og = number;
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }

     return og == reversed;
    }
    __________________________________________________________________________________________________
    ----------------------------------------------------------------------------------------------

    QUESTION 10- Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet iS
     when the sum of the square of two numbers is equal to the square of the third number).

-----------------------------------------------------------------------------------------------------
QUES 14. Write a function that returns the sum of first n natural numbers.

   int number = sc.nextInt();
//        System.out.println(sumnaturalnumbers1(number));
        System.out.println(sumnaturalnumbers2(number));


    }

    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    static int sumnaturalnumbers1(int number) {
        int sum = 0;
        for(int i = 1; i<=number; i++ ){
            sum+= i;
        }
        return sum;
    }
    static int sumnaturalnumbers2(int number){
        int sum = number * (number +1)/2;
        return sum;
    }
}


-----------------------------------------------------------------------------------------------------
*/

