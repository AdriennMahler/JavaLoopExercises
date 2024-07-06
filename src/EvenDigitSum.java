public class EvenDigitSum {
    /*
    Write a method named getEvenDigitSum with one parameter of type int called number.
    The method should return the sum of the even digits within the number.
    If the number is negative, the method should return -1 to indicate an invalid value.
     */
    public static void main(String[] args) {
       System.out.println(getEvenDigitSum(25623));
    }
    public static int getEvenDigitSum(int number){
            if( number<0) {
            return -1;
             }
            int sum=0;
       // Looping i=1, 10, 100 ...
            for(int i=1; i<=number+1; i*=10) {
       // number/i gives the digits
            int  digit = number / i;
       // check if number is even or odd
            if(digit%2==0) {
       //sum even digits
                sum += digit%10;
            }
        }
        return sum;
    }

    //Alternative
    /*
      int sum = 0;

    while(number > 0) {
        if (number % 2 == 0) {
            sum += number%10;
        }
        number /= 10;
    }
    return sum;
     */
}
