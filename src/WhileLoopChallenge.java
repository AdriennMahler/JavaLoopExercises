public class WhileLoopChallenge {

    /*
   Step 1. create a method called isEvenNumber takes a parameter type int
   -> determine if the argument passed to the method is an even number or not
   -> return true from the method if it is an even number
   -> otherwise return false

   -> use a while loop to test a range of numbers from 5 up to and including 20
   -> printing out only the even numbers -- by the call of the method
    */

    public static void main(String[] args) {
        int countTotal=0;
        int countEven=0;
        int i=5;
        int max=20;
        while(i<=max){
            i++;
            countTotal++;
            if(!isEvenNumber(i)) {
                continue;
            }
            if (countEven==5){
                break;
            }
            countEven++;
        }
        System.out.println(countEven + ": Number of Even Numbers");
        System.out.println(countTotal + ": Total Number of All Numbers");

    }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}