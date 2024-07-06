public class DigitSum {

    /*
    Write a method with the name sumDigits
    that has a single parameter named number, of type int,
    aand it should return an int.
    The method should only take a number that is a positive number.
    If negative number is passed, it should return -1.
    The method should parse out each digit from the number
    and sum the digits up.
     */
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number){
        while(number>0){
        number=number/10+number%10;
        if(number<10){
            return number;
        }
        }return -1;
    }
}
