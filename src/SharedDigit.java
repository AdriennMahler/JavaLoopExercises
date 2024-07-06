public class SharedDigit {

    public static void main(String[] args) {
        /*
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of
        10 (inclusive) - 99 (inclusive).
        If one of the numbers is not within the range,
        the method should return false.
        The method should return true if there is a
        digit that appears in both numbers,
        such as 2 in 12 and 23; otherwise, the method should return false.
         */
       System.out.println(hasSharedDigit(29,99));
    }
    public static boolean hasSharedDigit(int a, int b){
        if(a>99 || a<10 || b>99 || b<10){
            return false;
        }
            int digitAFirst = a % 10;
            int digitASecond = a / 10;
            int digitBFirst = b % 10;
            int digitBSecond = b / 10;

                if(digitAFirst==digitBSecond || (digitASecond==digitBSecond)
                        || (digitAFirst==digitBFirst) || (digitASecond==digitBFirst)){
                    return true;
                }
        return false;
    }
}

//Alternative

/*
for (int i = a; i > 0; i /= 10){
        for (int j = b; j > 0; j /= 10){
            if (i % 10 == j % 10){
                return true;
            }
        }
    }
    return false;
}
 */