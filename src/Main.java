import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        System.out.println("how manuy number do you need ?");
        System.out.println("==>");
        int num = scn.nextInt();
        Integer[] array = new Integer[num];


        for (int i = 0; i < num; i++) {

            System.out.println("enter num " + (i + 1) + " ");
            array[i] = scn.nextInt();
        }

        System.out.println("1- min" + "\n" + "2- max" + "\n" + "3- average" + "\n" + "4-repet number" + "\n" + "5-prime number ");

        int x = scn.nextInt();

        if (x == 1) {

            int result = CalCulator.GET_ARRAY_MIN_VALUE(array);
            System.out.println(result);

        } else if (x == 2) {

            int result = CalCulator.GET_ARRAY_MAX_VALUE(array);
            System.out.println(result);

        } else if (x == 3) {

            int result = CalCulator.GET_ARRAY_AVERAGE(array);
            System.out.println(result);

        } else if (x == 4) {

            System.out.println("enter number you want to check: ");
            int n = scn.nextInt();
            int result = CalCulator.GET_ARRAY_REPET_NUMBER(array, n);
            String r = result == 0 ? "there is no such number " : result == 1 ? "only once ": "repet for " + result + " time";

            System.out.println(r);

        }else if (x == 5){

            Stack<Integer> result = CalCulator.GET_ARRAY_PRIME_NUMBERS(array);
            System.out.println(result);
        }


    }
}