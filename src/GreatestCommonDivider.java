public class GreatestCommonDivider {
    /*
    Write a method named getGreatestCommonDivisor
    with two parameters of type int named first and second.
    If one of the parameters is < 10, the method should return -1
    to indicate an invalid value.
    The method should return the greatest common divisor of the two numbers (int).
    The greatest common divisor is the largest positive integer
    that can fully divide each of the integers (i.e. without leaving a remainder).
     */
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 18));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        int number =0;
        //looping both numbers finding with the common divisor
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                if (second % j == 0 && first % i == 0 && j == i) {
                    number = Math.max(i, j);
                }
            }
        }return number;
    }
    }

    //Alternative

/*
public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10)
        return -1;
    int number =0;

    for (int i = 1; i <= Math.min(first, second); i++) {
        if (second % i == 0 && first % i == 0) {
            number = i;
        }
    }return number;

}
 */


