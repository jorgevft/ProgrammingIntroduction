package exercices;

import java.util.Scanner;

/**
 * Created by pruiz on 9/27/17.
 */
public class MultiplicateTwoNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("dame primer número: ");
        int num1 = in.nextInt();

        //Todo: get the second number
        System.out.println("dame segundo número: ");
        int num2 = in.nextInt();

        //multiply 2 numbers
        int total = num1 * num2;


        //print the result
        System.out.println("el resultado es ");
        System.out.print(total);


    }

}
