public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    /*
    Schreiben Sie eine methode die gibt true zurück wenn parameter number is Palindrome --
    zB 101 , 1221, usw. sonst false.
     */

   public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit = 0;

        int num = Math.abs(number);
//in each while loop we are giving the last digit of the number to the reverse number
        while (num >0) {
            lastDigit = num % 10;
            reverse = reverse + lastDigit;
            reverse = reverse * 10;
            num = num / 10;
//we do not need to num/10 - it is the last digit, we add to reverse and our reverse number is done
            if (num >= 0 && num <10) {
                lastDigit = num %10;
                reverse = reverse + lastDigit;
            }
        }
       reverse /= 10;
        //returns a true/false even if the number is negative
       return reverse == Math.abs(number);
    }
}

