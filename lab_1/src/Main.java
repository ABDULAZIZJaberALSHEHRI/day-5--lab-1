import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("..Question 1..");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to apply mathematical operations on it: ");
        System.out.println("First number: ");
        int num_1 = input.nextInt();
        System.out.println("Second number: ");
        int num_2 = input.nextInt();

        int addition = num_1 + num_2;
        int subtract = num_1 - num_2;
        int multiply = num_1 * num_2;
        int divide = num_1 / num_2;
        int reminder = num_1 % num_2;

        System.out.println(num_1 +" + "+ num_2 +" = " + addition);
        System.out.println(num_1 +" - "+ num_2 +" = " + subtract);
        System.out.println(num_1 +" * "+ num_2 +" = " + multiply);
        System.out.println(num_1 +" / "+ num_2 +" = " + divide);
        System.out.println(num_1 +" mod "+ num_2 +" = " + reminder);


        //Question 2
        System.out.println("\n..Question 2..");

        System.out.println("Enter the number to print it's multiplication table up to 10: ");
        int num = input.nextInt();
        int result =1;
        for (int i = 1; i <= 10; i++) {
            result =num*i;
            System.out.println(num +"*"+i + "="+ result);
        }

        //Question 3
        System.out.println("\n..Question 3..");

        System.out.println("Enter the radius of a circle to print it's area and perimeter:");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Radius = "+radius+"\n Perimeter = "+ perimeter+ "\n Area = "+ area);


        //Question 4
        System.out.println("\n..Question 4..");

        System.out.println("Enter the count of numbers to see it's average: ");
        int num_count = input.nextInt();
        int numbers;
        double sum = 0;
        for (int i = 0; i < num_count; i++) {

            System.out.println("Enter an integer: ");
            numbers  = input.nextInt();

            sum = numbers + sum;

        }
        double avr = sum / num_count;

        System.out.println("The average is: "+avr);


        //Question 5
        System.out.println("\n..Question 5..");

        System.out.println("Enter three integers so the program will check if the sum of first two integers" +
                " equals to the third integer or not");

        System.out.print("Please enter the first number: ");
        int number_1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int number_2 = input.nextInt();
        System.out.print("Please enter the third number: ");
        int number_3 = input.nextInt();

        int sum_$ = number_1 + number_2;
        if (sum_$ == number_3){
            System.out.println("The result is: True");
        }else {
            System.out.println("The result is: False");
        }


        //Question 6
        System.out.println("\n..Question 6..");
        System.out.println("Input a word: ");
        String word = input.next();
        StringBuilder str = new StringBuilder(word);
        StringBuilder str_rev = str.reverse();
        System.out.println("Reverse word: "+str_rev);

        //Question 7
        System.out.println("\n..Question 7..");

        System.out.println("Enter a number and the program will check if it even or odd: ");
        int number_$ = input.nextInt();

        if (number_$ % 2 == 0){
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }


        //Question 8
        System.out.println("\n..Question 8..");

        System.out.println("Enter temperature in Centigrade so the program convert it to Fahrenheit : ");
        double temp_c = input.nextDouble();

        double temp_f= (temp_c*1.8) + 32;

        System.out.println("Temperature in Fahrenheit is: " + temp_f);


        //Question 9
        System.out.println("\n..Question 9..");

        System.out.println("Enter string: ");
        input.nextLine();
        String str_$ = input.nextLine();
        System.out.println("Enter number of the string index: ");
        int num_index = input.nextInt();
        str_$.charAt(num_index);
        System.out.println(str_$.charAt(num_index));


        //Question 10
        System.out.println("\n..Question 10..");

        System.out.println("Area and perimeter of a rectangle");
        System.out.println("Enter the width");
        double width = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();

        double area_1 = width * height;
        double perimeter_1 = 2 * (width + height);

        System.out.println("Area = " + width+ " * " + height + " = " +area_1);
        System.out.println("Perimeter is = " +" 2 * "+ "("+width + "+" + height+")"+"="+perimeter_1);


        //Question 11
        System.out.println("\n..Question 11..");

        System.out.println("Compare two numbers:");

        System.out.println("Enter first number");
        int num_3 = input.nextInt();

        System.out.println("Enter second number");
        int num_4 = input.nextInt();


        if (num_3 == num_4){
            System.out.println(num_3 +" = "+num_4);
        }else{
            System.out.println(num_3 +" != "+num_4);
        }

        if (num_3 < num_4){
            System.out.println(num_3 +" < "+num_4);
        }else{
            System.out.println(num_3 +" > "+num_4);
        }
        if (num_3 <= num_4){
            System.out.println(num_3 +" <= "+num_4);
        }else{
            System.out.println(num_3 +" >= "+num_4);
        }

        //Question 12
        System.out.println("\n..Question 12..");

        System.out.println("Convert seconds to hours, minutes and seconds:");

        System.out.println("Input seconds: ");
        int sec_t = input.nextInt();

        int hourse = sec_t / 60;
        int minutes = sec_t  % 60;
        int sec = sec_t % 60;
        hourse = hourse /60;

        System.out.print(hourse + ":" + minutes + ":" + sec);





        //Question 13
        System.out.println("\n..Question 13..");

        System.out.println("The program will check if the number you will enter if it's equal or not: ");

        System.out.println("Enter first number");
        int number_f = input.nextInt();
        System.out.println("Enter second number");
        int number_s = input.nextInt();
        System.out.println("Enter third number");
        int number_t = input.nextInt();
        System.out.println("Enter fourth number");
        int number_fo = input.nextInt();

        if (number_f == number_fo && number_s == number_t && number_f == number_t){
            System.out.println("all entered numbers are equal to each-other");
        }else{
            System.out.println("numbers are not equal to each-other ");
        }




        //Question 14
        System.out.println("\n..Question 14..");

        System.out.println("Enter number and the program will check whether it is negative, zero, or\n" +
                "positive");

        System.out.println("Please enter a number: ");
        int number_9 = input.nextInt();

        if (number_9 > 0){
            System.out.println("Number is positive.");
        } else if (number_9 < 0) {
            System.out.println("Number is negative.");
        }else {
            System.out.println("Number is zero.");
        }



        //Question 15
        System.out.println("\n..Question 15..");


        System.out.println("The program will count positive, negative and zeros numbers you will enter.");
        int zero = 0;
        int positive = 0;
        int negative = 0;
        int num_7 =0;

        num_7 = 0;

        while (num_7 != -1) {

            System.out.println("please enter your number or '-1' to exit: ");
            num_7 = input.nextInt();



            if (num_7 > 0) {
                positive++;
            } else if (num_7 < 0 && num_7!= -1) {
                negative++;
            } else if (num_7 ==0){
                zero++;
            }else {
                break;
            }


        }
        System.out.println("negative numbers =" + negative + "\npositive numbers =" + positive +
                "\nzero numbers =" + zero);



        //Question 16
        System.out.println("\n..Question 16..");


        System.out.println("Please write a set of numbers: ");
        int num_5 = input.nextInt();
        int rev = 0;

        for(;num_5 != 0; num_5 /= 10) {
            int digit = num_5 % 10;
            rev = rev * 10 + digit;
        }

        System.out.println(rev);




        //Question 17
        System.out.println("\n..Question 17..");

        System.out.println("Enter set of numbers and the program will print the largest and smallest numbers.");

        int number_17;

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;


        do {
            System.out.println("enter your number or '00' to exit: ");
            number_17 = input.nextInt();

            if (number_17 == 00){
                break;
            }

            if (maximum < number_17){
                maximum = number_17;
            }

            if (minimum > number_17){
                minimum = number_17;
            }


        }while (number_17 != 00);
        System.out.println("the large number :" + maximum);
        System.out.println("the small number :" + minimum);




        //Question 18
        System.out.println("\n..Question 18..");

        System.out.println("Enter a string:");
        String str_18 = input.nextLine();
        char someChar = 'a';
        int count = 0;

        for (int i = 0; i < str_18.length(); i++) {
            if (str_18.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println("Number of a's: " +count);

    }
}