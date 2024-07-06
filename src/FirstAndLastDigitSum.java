public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        /*
        Write a method named sumFirstAndLastDigit
        with one parameter of type int called number.
        The method needs to find the first and the last digit
        of the parameter number passed to the method,
        using a loop and return the sum of the first
        and the last digit of that number.
        If the number is negative then the method needs to
        return -1 to indicate an invalid value.
         */
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {

        //looping i=1, 10, 100
        for(int i=1; i<=number+1; i*=10) {
        // finding last digit
          int  lastDigit = number % 10;
        //finding first digit
            int firstDigit = number / i;
        //loop until 10>first digit>0
            if(firstDigit>=0 && firstDigit<10 && number>=0){
                int sum=lastDigit+firstDigit;
                return sum;
            }
        }
        return -1;
    }
}



