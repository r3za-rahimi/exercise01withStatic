import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class CalCulator {

    public static int GET_ARRAY_MIN_VALUE(Integer[] araay) {

        Arrays.sort(araay);
        return araay[0];

    }

    public static int GET_ARRAY_MAX_VALUE(Integer[] array) {

        Arrays.sort(array, Collections.reverseOrder());
        return array[0];
    }

    public static int GET_ARRAY_AVERAGE(Integer[] array) {

        int sum = 0;

        for (int x : array) {

            sum += x;
        }
        return sum / array.length;
    }


    public static int GET_ARRAY_REPET_NUMBER(Integer[] array, int number) {

        int flag = 0;
        for (int x : array) {


            if (x == number) {

                flag++;
            }

        }

        return flag;

    }

    public static Stack<Integer> GET_ARRAY_PRIME_NUMBERS(Integer[] array) {

        Stack<Integer> result = new Stack<>();

        for (int x : array) {

            if (checkPrimeNumber(x)) {

                result.push(x);
            }

        }

        return result;
    }

    private static boolean checkPrimeNumber(int num) {

        boolean result = true;
        if (num == 2) {

            return true;

        } else if (num == 0 || num == 1) {


            result = false;

        } else if (num % 2 == 0) {

            result = false;

        } else {

            for (int i = 2; i < ((num + 1) / 2); i++) {

                if (num % i == 0) {

                    result = false;

                    break;
                }

            }


        }
        return result;

    }

}
