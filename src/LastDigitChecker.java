public class LastDigitChecker {
    /*
    Write a method named hasSameLastDigit
    with three parameters of type int.
    Each number should be within the range of
    10 (inclusive) - 1000 (inclusive).
    If one of the numbers is not within the range,
    the method should return false.
    The method should return true if at least two
    of the numbers share the same rightmost digit;
    otherwise, it should return false.
     */

    public static void main(String[] args) {
     System.out.println(hasSameLastDigit(99, 99, 999));
     System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (a > 999 || a < 10 || b > 999 || b < 10 || c > 999 || c < 10) {
            return false;
        }
        //get the last digits of the parameters
        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;

        //check if the last digits are the same

        if ((digitA == digitB) || (digitC == digitB) || (digitC == digitA)) {
            return true;
                    }
        return false;
    }
    //helper method to decide if a 10<=number<=1000
    public static boolean isValid(int number){
        return number>=10 && number <=1000;

    }

}

