package exercices;

import java.util.Scanner;

/**
 * Created by pruiz on 9/24/17.
 */
public class DaysOfWeek {

    public static void main(String[] args) {

        Scanner scann = new Scanner( System.in );

        System.out.println("ingresa numero de día de la semana");

        String day = scann.next();

        switch ( day ){
            case "1":
                System.out.print("lunes");
                break;
            case "2":
                System.out.print("martes");
                break;
            case "3":
                System.out.print("miercoles");
                break;
            case "4":
                System.out.print("jueves");
                break;
            case "5":
                System.out.print("viernes");
                break;
            case "6":
                System.out.print("sabado");
                break;
            case "7":
                System.out.print("domingo");
                break;
            default:
                System.out.print("no es un día de la semana");


        }

    }

}
